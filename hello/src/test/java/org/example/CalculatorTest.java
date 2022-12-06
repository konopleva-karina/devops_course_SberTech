package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    void addition() {
        Assertions.assertEquals(3, calculator.add(1, 2));
    }
}
