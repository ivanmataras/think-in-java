package ru.ivanmataras.education.chapter7;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(OrderAnnotation.class)
public class TestInitialize1 {

    @Test
    @Order(1)
    public void testInitializeClasses1() {

        Child child = new Child();

        //child.testChildPrivateMethod();
        child.testChildPackageMethod();
        child.testChildProtectedMethod();
        child.testChildPublicMethod();

        //child.testParentPrivateMethod();
        child.testParentPackageMethod();
        child.testParentProtectedMethod();
        child.testParentPublicMethod();

        child.toString();

    }

    @Test
    @Order(2)
    public void testCADSystem() {

        CADSystem cadSystem = new CADSystem(47);

        try {

        } finally {
            cadSystem.dispose();
        }

    }

}