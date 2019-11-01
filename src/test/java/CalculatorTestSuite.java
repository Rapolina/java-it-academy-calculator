import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({CalculatorPositiveTests.class, CalculatorNegativeTests.class, CalculatorIgnoredTests.class} )
public class CalculatorTestSuite {
}
