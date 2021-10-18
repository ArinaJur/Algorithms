import org.junit.Assert;
import org.junit.Test;

public class LargerValueTest {

    @Test
    public void testReturnLargerValue() {
        int a = 3333;
        int b = 9999;
        int expectedResult = 9999;

        LargerValue largerValue = new LargerValue();
        int actualResult = largerValue.returnLargerValue(a, b);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testZero() {
        int a = 0;
        int b = 0;
        int expectedResult = 0;

        LargerValue largerValue = new LargerValue();
        int actualResult = largerValue.returnLargerValue(a, b);

        Assert.assertEquals(expectedResult, actualResult);
    }
}
