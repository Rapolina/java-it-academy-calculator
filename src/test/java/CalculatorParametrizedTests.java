import com.company.Calculator;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

public class CalculatorParametrizedTests {

    // TODO : Use @Before
    private Calculator calculator = new Calculator();

    // TODO : Add to test suite
    @ParameterizedTest
    @CsvSource(value = {"5,5", "3,7"}, delimiter =',')
    public void testSum(int a, int b)
    {
        assertEquals(10, this.calculator.sum(a, b));
    }
}
