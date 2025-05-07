package lab15.sict.must.edu.mn;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DivisionTest {

    @Test
    void testDivideNormal() {
        Division calc = new Division();
        assertEquals(5.0, calc.divide(10.0, 2.0));
    }

    @Test
    void testDivideByZero() {
        Division calc = new Division();
        assertThrows(ArithmeticException.class, () -> calc.divide(10.0, 0));
    }
}
