package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.Calculator;

import static org.testng.Assert.assertEquals;

public class CalculatorDivision {

    private Calculator calculator;

    @BeforeClass
    public void createCalculator() {
        calculator = new Calculator();
    }

    @Parameters({"a", "b"})
    @Test(expectedExceptions = {ArithmeticException.class})
    public void division(@Optional("0") double a, @Optional("0") double b) throws InterruptedException {
        Thread.sleep(1000);
        calculator.division(a, b);
    }

    @Test
    public void calcDivisionPrimeNumbers() {
        double division = calculator.division(9, 3);
        assertEquals(division, 3, "Результат деления чисел неверен");
    }

    @Test
    public void calcDivisionNegativeNumbers() {
        double division = calculator.division(-6, -3);
        assertEquals(division, 2, "Результат деления чисел неверен");
    }

    @Test
    public void calcDivisionFractionalNumbers() {
        double division = calculator.division(18.3, 9);
        assertEquals(division, 2.033333333333333, "Результат деления чисел неверен");
    }
}