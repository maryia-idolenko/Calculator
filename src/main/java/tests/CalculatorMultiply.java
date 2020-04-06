package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.Calculator;

import static org.testng.Assert.assertEquals;

public class CalculatorMultiply {

    private Calculator calculator;

    @BeforeClass
    public void createCalculator() {
        calculator = new Calculator();
    }

    @DataProvider(name = "Входящие данные для умножения")
    public Object[][] inputForCalcSum() {
        return new Object[][]{
                {1, 2, 2},
                {-1, -6, 6},
                {8.3, 9, 74.7},
        };
    }

    @Test(dataProvider = "Входящие данные для умножения")
    public void caclMult(double a, double b, double expectedResult) {
        double multResult = calculator.multiply(a, b);
        assertEquals(multResult, expectedResult, "Произведение чисел неверно");
    }

    @Test
    public void calcMultiplyPrimeNumbers() {
        double multiply = calculator.multiply(4, 8);
        assertEquals(multiply, 32, "Результат умножения чисел неверен");
    }

    @Test
    public void calcMultiplyNegativeNumbers() {
        double multiply = calculator.multiply(-2, -6);
        assertEquals(multiply, 12, "Результат умножения чисел неверен");
    }

    @Test
    public void calcMultiplyFractionalNumbers() {
        double multiply = calculator.multiply(8.3, 9);
        assertEquals(multiply, 74.7, "Результат умножения чисел неверен");
    }
}