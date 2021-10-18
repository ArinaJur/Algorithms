import org.junit.Assert;
import org.junit.Test;

public class OddEvenTest {

    @Test
    public void testOddNegativeNumber() {
        int number = -345;
        String expectedResult = "Odd";

        OddEven oddEven = new OddEven();
        String actualResult = oddEven.checkOddEven(number);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddPositiveNumber() {
        int number = -345;
        String expectedResult = "Odd";

        OddEven oddEven = new OddEven();
        String actualResult = oddEven.checkOddEven(number);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testZero() {
        int number = 0;
        String expectedResult = "Even";

        OddEven oddEven = new OddEven();
        String actualResult = oddEven.checkOddEven(number);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testEvenPositiveNumber() {
        int number = 222222;
        String expectedResult = "Even";

        OddEven oddEven = new OddEven();
        String actualResult = oddEven.checkOddEven(number);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testEvenNegativeNumber() {
        int number = -222222;
        String expectedResult = "Even";

        OddEven oddEven = new OddEven();
        String actualResult = oddEven.checkOddEven(number);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testUndefinedMoreThanMax() {
        long number = 2147483648L;
        String expectedResult = "Undefined";

        OddEven oddEven = new OddEven();
        String actualResult = oddEven.checkOddEven(number);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testUndefinedLessThanMin() {
        long number = -2147483649L;
        String expectedResult = "Undefined";

        OddEven oddEven = new OddEven();
        String actualResult = oddEven.checkOddEven(number);

        Assert.assertEquals(expectedResult, actualResult);
    }

}
