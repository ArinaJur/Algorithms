import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void testFizzBuzz() {
        int startNumber = 1;
        int endNumber = 15;
        String[] expectedResult =
                {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"};

        FizzBuzz fizzBuzzObj = new FizzBuzz();
        String[] actualResult = fizzBuzzObj.fizzBuzz(startNumber, endNumber);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testGoodNumber() {
        int m = 15;
        String expectedResult = "Good Number";

        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualResult = fizzBuzz.checkNumber(m);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testBadNumber() {
        int m = 33;
        String expectedResult = "Bad Number";

        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualResult = fizzBuzz.checkNumber(m);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testPoorNumber() {
        int m = 55;
        String expectedResult = "Poor Number";

        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualResult = fizzBuzz.checkNumber(m);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testNumber() {
        int m = 19;
        String expectedResult = "-1";

        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualResult = fizzBuzz.checkNumber(m);

        Assert.assertEquals(expectedResult, actualResult);
    }
}
