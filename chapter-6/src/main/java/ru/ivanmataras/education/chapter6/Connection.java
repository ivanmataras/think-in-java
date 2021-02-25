package ru.ivanmataras.education.chapter6;

class Connection {

    private String connectionId;
    private String connectionName;
    private String connectionAddress;
    private String connectionPort;

    Connection() {

    }

    String getConnectionId() {
        return connectionId;
    }

    void setConnectionId(String connectionId) {
        this.connectionId = connectionId;
    }

}