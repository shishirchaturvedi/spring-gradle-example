package com.pandora.mobiletools.hygieia.pipeline.testapp;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * CalculatorJUnit5Test.
 */
public class CalculatorJUnit5Test {
    /**
     * testAddMaxInteger.
     */
    @Tag("slow")
    @Test
    public void testAddMaxInteger() {
        assertEquals(2147483646, Integer.sum(2147183646, 300000));
    }

    /**
     * testDivide.
     */
    @Tag("fast")
    @Test
    public void testDivide() {
        assertThrows(ArithmeticException.class, () -> {
            Integer.divideUnsigned(42, 0);
        });
    }
}
