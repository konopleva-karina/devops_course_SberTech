package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    void testAdd() {
        Assertions.assertEquals(5, calculator.add(3, 2));
    }
}
