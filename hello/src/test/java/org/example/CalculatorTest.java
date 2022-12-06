package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    void addition() {
        Assertions.assertEquals(5, calculator.add(3, 2));
    }
}
