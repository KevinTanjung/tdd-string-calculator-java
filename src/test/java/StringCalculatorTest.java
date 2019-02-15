
import com.onlinepajak.tdd.StringCalculator;
import org.junit.Test;
import org.junit.Assert;

public class StringCalculatorTest {
  @Test
  public void testGivenEmptyStringReturnZero () {
    StringCalculator calculator = new StringCalculator();
    Assert.assertEquals(0, calculator.add(''));
  }
}