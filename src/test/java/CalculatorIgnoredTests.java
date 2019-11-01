import com.company.Calculator;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorIgnoredTests {

    private Calculator calculator;

    @Before
    public void init()
    {
        this.calculator = new Calculator();
    }

    @Ignore
    @Test
    public void testSum()
    {
        assertEquals(12, this.calculator.sum(5, 5));
    }
}
