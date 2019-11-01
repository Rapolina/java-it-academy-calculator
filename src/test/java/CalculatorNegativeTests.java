import com.company.Calculator;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorNegativeTests {

    private Calculator calculator;

    @Before
    public void init()
    {
        this.calculator = new Calculator();
    }

    @Test(expected = java.lang.ArithmeticException.class)
    public void testDivideByZero()
    {
        calculator.divide(10, 0);
    }
}
