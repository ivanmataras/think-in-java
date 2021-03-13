package ru.ivanmataras.education.chapter6;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

@TestMethodOrder(OrderAnnotation.class)
class TestConnectionManager {

    @Test
    @Order(1)
    void testExercise_8() {
        ConnectionManager connectionManager = ConnectionManager.getInstance();
        assertNotNull(connectionManager);
        ConnectionManager.fillConnectionPool();
        Connection connection0 = ConnectionManager.getConnection();
        Connection connection1 = ConnectionManager.getConnection();
        Connection connection2 = ConnectionManager.getConnection();
        Connection connection3 = ConnectionManager.getConnection();
        Connection connection4 = ConnectionManager.getConnection();
        Connection connection5 = ConnectionManager.getConnection();
        Connection connection6 = ConnectionManager.getConnection();
        Connection connection7 = ConnectionManager.getConnection();
        Connection connection8 = ConnectionManager.getConnection();
        Connection connection9 = ConnectionManager.getConnection();
        assertNull(connection9);
    }

}