import org.junit.Assert;
import org.junit.Test;

public class PositiveNegativeZeroTest {

    @Test
    public void testPositive() {
        int number = 555;
        boolean expectedResult = true;

        PositiveNegativeZero positiveNegativeZero = new PositiveNegativeZero();
        boolean actualResult = positiveNegativeZero.isPositiveNegativeZero(number);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testZero() {
        int number = 0;
        boolean expectedResult = true;

        PositiveNegativeZero positiveNegativeZero = new PositiveNegativeZero();
        boolean actualResult = positiveNegativeZero.isPositiveNegativeZero(number);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testNegative() {
        int number = -555;
        boolean expectedResult = false;

        PositiveNegativeZero positiveNegativeZero = new PositiveNegativeZero();
        boolean actualResult = positiveNegativeZero.isPositiveNegativeZero(number);

        Assert.assertEquals(expectedResult, actualResult);
    }
}
