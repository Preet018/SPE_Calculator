import org.example.Calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    // Square Root Function
    @Test
    public void testSquareRoot() {
        assertEquals(4.0, Calculator.squareRoot(16), 0.0001);
        assertEquals(5.0, Calculator.squareRoot(25), 0.0001);
    }

    @Test
    public void testSquareRootNegative() {
        assertThrows(IllegalArgumentException.class, () -> {
            Calculator.squareRoot(-9);
        });

        assertThrows(IllegalArgumentException.class, () -> {
            Calculator.squareRoot(-15);
        });
    }

    // Factorial Function
    @Test
    public void testFactorial() {
        assertEquals(120.0, Calculator.factorial(5));
        assertEquals(1.0, Calculator.factorial(0));
    }

    @Test
    public void testFactorialNegative() {
        assertThrows(IllegalArgumentException.class, () -> {
            Calculator.factorial(-3);
        });

        assertThrows(IllegalArgumentException.class, () -> {
            Calculator.factorial(-10);
        });
    }

    @Test
    public void testFactorialTooLarge() {
        assertThrows(IllegalArgumentException.class, () -> {
            Calculator.factorial(45);
        });
    }

    // Natural Log Function
    @Test
    public void testNaturalLog() {
        assertEquals(Math.log(10), Calculator.naturalLog(10), 0.0001);
        assertEquals(Math.log(1), Calculator.naturalLog(1), 0.0001);
    }

    @Test
    public void testNaturalLogInvalid() {
        assertThrows(IllegalArgumentException.class, () -> {
            Calculator.naturalLog(0);
        });

        assertThrows(IllegalArgumentException.class, () -> {
            Calculator.naturalLog(-18);
        });
    }

    // Power Function
    @Test
    public void testPower() {
        assertEquals(32.0, Calculator.power(2, 5), 0.0001);
        assertEquals(27.0, Calculator.power(3, 3), 0.0001);
        assertEquals(1.0, Calculator.power(5, 0), 0.0001);
    }

    @Test
    public void testPowerInvalid() {
        assertThrows(IllegalArgumentException.class, () -> {
            Calculator.power(0, -2);
        });

        assertThrows(IllegalArgumentException.class, () -> {
            Calculator.power(0, -5);
        });
    }
}
