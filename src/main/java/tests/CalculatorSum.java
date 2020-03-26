package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.Calculator;

import static org.testng.Assert.assertEquals;


public class CalculatorSum {
    private Calculator calculator;

    @BeforeClass
    public void createCalculator() {
        calculator = new Calculator();
    }

    @Test
    public void calcSumPrimeNumbers() {
        double sum = calculator.sum(1, 2);
        assertEquals(sum, 3, "Сумма чисел неверна");
    }

    @Test
    public void calcSumNegativeNumbers() {
        double sum = calculator.sum(-1, -6);
        assertEquals(sum, -7, "Сумма чисел неверна");
    }

    @Test
    public void calcSumFractionalNumbers() {
        double sum = calculator.sum(5.3, 9.5);
        assertEquals(sum, 14.8, "Сумма чисел неверна");
    }

    @DataProvider(name = "Входящие данные для сложения")
    public Object[][] inputForCalcSum() {
        return new Object[][]{
                {1, 2, 3},
                {-1, -6, -7},
                {5.3, 9.5, 14.8},
        };
    }

    @Test(dataProvider = "Входящие данные для сложения")
    public void caclSum(double a, double b, double expectedResult) {
        double sum = calculator.sum(a, b);
        assertEquals(sum, expectedResult, "Сумма чисел неверна");
    }
}