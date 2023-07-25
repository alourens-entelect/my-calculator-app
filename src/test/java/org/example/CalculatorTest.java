package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void test_additionCalculation() {
        String input = "5.70+2.30";
        Double result = Calculator.getCalculationResult(input);
        assertEquals(Double.valueOf(8.0), result);
    }

    @Test
    public void test_deductionCalculation() {
        String input = "100.5-50.80";
        Double result = Calculator.getCalculationResult(input);
        assertEquals(Double.valueOf(49.7), result);
    }

    @Test
    public void test_multiplicationCalculation() {
        String input = "5.525*2.30";
        Double result = Calculator.getCalculationResult(input);
        assertEquals(Double.valueOf(12.7075), result);
    }

    @Test
    public void test_divisionCalculation() {
        String input = "5.50/2.00";
        Double result = Calculator.getCalculationResult(input);
        assertEquals(Double.valueOf(2.75), result);
    }

    @Test
    public void test_advancedCalculation() {
        String input = "200.5/2-5*3/5*3";
        Double result = Calculator.getCalculationResult(input);
        assertEquals(Double.valueOf(91.25), result);
    }

}
