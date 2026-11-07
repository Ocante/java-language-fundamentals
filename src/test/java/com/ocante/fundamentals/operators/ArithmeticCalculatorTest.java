package com.ocante.fundamentals.operators;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ArithmeticCalculatorTest {
    private ArithmeticCalculator calculator =
            new ArithmeticCalculator();

    @Test
    void shouldAddTwoNumbers() {
        int result = calculator.add(10, 3);
        assertEquals(13, result);
    }

    @Test
    void shouldSubtractTwoNumbers() {
        int result = calculator.subtract(10, 3);
        assertEquals(7, result);
    }

    @Test
    void shouldMultiplyTwoNumbers() {
        int result = calculator.multiply(10, 3);
        assertEquals(30, result);
    }

    @Test
    void shouldDivideTwoNumbers() {
        int result = calculator.divide(10, 3);
        assertEquals(3, result);
    }

    @Test
    void shouldCalculateRemainder() {
        int result = calculator.remainder(10, 3);
        assertEquals(1, result);
    }

    @Test
    void shouldExceptionWhenDivisionByteZero() {
        assertThrows(
                ArithmeticException.class,
                () -> calculator.divide(10, 0));
    }
}
