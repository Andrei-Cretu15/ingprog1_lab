package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class DoubleCalculatorTest {

    @Test
    public void testAdd() {
        // Arrange
        DoubleCalculator calculator = new DoubleCalculator(10.0);

        // Act
        double result = calculator.add(5.5).result();

        // Assert
        assertEquals(15.5, result, 0.001);
    }

    @Test
    public void testSubtract() {
        // Arrange
        DoubleCalculator calculator = new DoubleCalculator(10.0);

        // Act
        double result = calculator.subtract(3.3).result();

        // Assert
        assertEquals(6.7, result, 0.001);
    }

    @Test
    public void testMultiply() {
        // Arrange
        DoubleCalculator calculator = new DoubleCalculator(10.0);

        // Act
        double result = calculator.multiply(2.2).result();

        // Assert
        assertEquals(22.0, result, 0.001);
    }

    @Test
    public void testDivideByZeroPositive() {
        // Arrange
        DoubleCalculator calculator = new DoubleCalculator(10.0);

        // Act
        double result = calculator.divide(0).result();

        // Assert
        assertEquals(Double.POSITIVE_INFINITY, result, 0.001);
    }

    @Test
    public void testDivideByZeroNegative() {
        // Arrange
        DoubleCalculator calculator = new DoubleCalculator(-10.0);

        // Act
        double result = calculator.divide(0).result();

        // Assert
        assertEquals(Double.NEGATIVE_INFINITY, result, 0.001);
    }
}
