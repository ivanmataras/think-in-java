package ru.ivanmataras.education.chapter1;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static java.lang.System.out;
import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(OrderAnnotation.class)
class TestInsuranceExample {

    @Test
    @Order(1)
    void testInsuranceExample() {
        Insurance insurance = new CarInsurance();
        int insurancePremium = insurance.premium();
        String insuranceCategory = insurance.category();

        out.println("Insurance premium : " + insurancePremium);
        out.println("Insurance category : " + insuranceCategory);

        assertEquals(200, insurancePremium);
        assertEquals("Insurance", insuranceCategory);

        CarInsurance carInsurance = new CarInsurance();
        int carInsurancePremium = carInsurance.premium();
        String carInsuranceCategory = carInsurance.category();

        out.println("CarInsurance premium : " + carInsurancePremium);
        out.println("CarInsurance category : " + carInsuranceCategory);

        assertEquals(200, carInsurancePremium);
        assertEquals("Car Insurance", carInsuranceCategory);
    }

}