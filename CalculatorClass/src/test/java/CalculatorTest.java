import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator ();
    } //void because we are not returing anything.

    @Test
    public void Add() {
        int firstNumber = 10;
        int secondNumber = 5;
        assertEquals(15, calculator.add(firstNumber, secondNumber));
    }

    @Test
    public void Subtract() {
        int firstNumber = 10;
        int secondNumber = 5;
        assertEquals(5, calculator.subtract(firstNumber, secondNumber));
    }

    @Test
    public void Multiply() {
        int firstNumber = 10;
        int secondNumber = 5;
        assertEquals(50, calculator.multiply(firstNumber, secondNumber));
    }

    @Test
    public void Divide() {
        double firstNumber = 10;
        double secondNumber = 5;
        assertEquals(2.0, calculator.divide(firstNumber, secondNumber), 0.0);
    }
}
