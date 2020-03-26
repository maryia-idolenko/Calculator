package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.Calculator;

import static org.testng.Assert.assertEquals;

public class CalculatorMinus {

    private Calculator calculator;

    @BeforeClass
    public void createCalculator() {
        calculator = new Calculator();
    }

    @Test
    public void calcMinusPrimeNumbers() {
        double minus = calculator.minus(4, 1);
        assertEquals(minus, 3, "Разность чисел неверна");
    }

    @Test
    public void calcMinusNegativeNumbers() {
        double minus = calculator.minus(-1, -6);
        assertEquals(minus, 5, "Разность чисел неверна");
    }

    @Test
    public void calcMinusFractionalNumbers() {
        double minus = calculator.minus(18.3, 9.5);
        assertEquals(minus, 8.8, "Разность чисел неверна");
    }
}