package com.example.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    void testAdd1() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(2, 3));
    }

     @Test
    void testAdd2() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(8, 3));
    }

    @Test
    void testMultiply() {
        Calculator calculator = new Calculator();
        assertEquals(6, calculator.multiply(2, 3));
    }
}
