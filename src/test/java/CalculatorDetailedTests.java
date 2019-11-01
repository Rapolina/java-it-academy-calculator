import com.company.Calculator;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorDetailedTests {

    private Calculator calculator;

    @Before
    public void init()
    {
        this.calculator = new Calculator();
    }

    @Test
    public void testSum()
    {
        assertEquals("Sum does not work.", 10, this.calculator.sum(5, 5));
    }
}
