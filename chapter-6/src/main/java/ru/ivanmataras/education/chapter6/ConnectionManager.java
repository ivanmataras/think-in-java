package ru.ivanmataras.education.chapter6;

import java.util.ArrayList;
import java.util.List;

final class ConnectionManager {

    private static final List<Connection> connections = new ArrayList<Connection>();
    private static final int CONNECTION_POOL_SIZE = 10;
    private static ConnectionManager connectionManager;
    private static int freeConnectionCount = connections.size();
    private static int newConnectionIndex = 0;

    private ConnectionManager() {

    }

    static synchronized ConnectionManager getInstance() {
        if (connectionManager == null) {
            connectionManager = new ConnectionManager();
        }
        return connectionManager;
    }

    static synchronized void fillConnectionPool() {
        for (int i = 0; i < CONNECTION_POOL_SIZE; i++) {
            connections.add(new Connection());
            freeConnectionCount = i;
        }
    }

    static synchronized Connection getConnection() {
        if (freeConnectionCount > 0) {
            Connection connection = connections.get(newConnectionIndex++);
            freeConnectionCount--;
            return connection;
        } else {
            return null;
        }
    }

}