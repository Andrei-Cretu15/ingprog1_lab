package org.example;
import org.junit.Test;
import static org.junit.Assert.*;

public class NewIntCalculatorTest {

    @Test
    public void testAdd() {
        // Arrange
        NewIntCalculator calculator = new NewIntCalculator(10);

        // Act
        int result = calculator.add(5).result();

        // Assert
        assertEquals(15, result);
    }

    @Test
    public void testAddPositive() {
        // Arrange
        NewIntCalculator calculator = new NewIntCalculator(10);

        // Act
        int result = calculator.add(5).result();

        // Assert
        assertEquals(15, result);
    }
    @Test
    public void testAddNegative() {
        // Arrange
        NewIntCalculator calculator = new NewIntCalculator(10);

        // Act
        int result = calculator.add(-5).result();

        // Assert
        assertEquals(5, result);
    }


    @Test
    public void testSubtract() {
        // Arrange
        NewIntCalculator calculator = new NewIntCalculator(10);

        // Act
        int result = calculator.subtract(3).result();

        // Assert
        assertEquals(7, result);
    }

    @Test
    public void testMultiply() {
        // Arrange
        NewIntCalculator calculator = new NewIntCalculator(10);

        // Act
        int result = calculator.multiply(2).result();

        // Assert
        assertEquals(20, result);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideByZero() {
        // Arrange
        NewIntCalculator calculator = new NewIntCalculator(10);

        // Act
        calculator.divide(0);
    }
}

