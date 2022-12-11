package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    public void addTest() {
        Assertions.assertEquals(6, calculator.add(4, 2));
    }
}
