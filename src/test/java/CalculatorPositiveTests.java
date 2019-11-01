import com.company.Calculator;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorPositiveTests {

    private Calculator calculator;

    @Before
    public void init()
    {
        this.calculator = new Calculator();
    }

    @Test
    public void testSum()
    {
        assertEquals(10, this.calculator.sum(5, 5));
    }

    @Test
    public void testDiff()
    {
        assertEquals(0, this.calculator.diff(5, 5));
    }

    @Test
    public void testDivide()
    {
        assertEquals(1, this.calculator.divide(5, 5));
    }

    @Test
    public void testMultiplication()
    {
        assertEquals(25, this.calculator.multiply(5, 5));
    }

    @Test
    public void testPow()
    {
        assertEquals(4., this.calculator.pow(2., 2.), 0);
    }
}
