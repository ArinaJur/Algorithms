import org.junit.Assert;
import org.junit.Test;

public class MaxMinAveTest {

    @Test
    public void testReturnMaxMinAveHappyPath() {
        int[] array = {1, 2, 3, 4, 5};
        int[] expectedResult = {5, 1, 3};

        MaxMinAve maxMinAve = new MaxMinAve();
        int[] actualResult = maxMinAve.returnMaxMinAve(array);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testReturnMaxMinAveHappyPath1() {
        int[] array = {-3, 0, 155, -39, 1003};
        int[] expectedResult = {1003, -39, 223};

        MaxMinAve maxMinAve = new MaxMinAve();
        int[] actualResult = maxMinAve.returnMaxMinAve(array);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testReturnMaxMinAveSingleElement() {
        int[] array = {2};
        int[] expectedResult = {2, 2, 2};

        MaxMinAve maxMinAve = new MaxMinAve();
        int[] actualResult = maxMinAve.returnMaxMinAve(array);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testReturnMaxMinAveTwoElements() {
        int[] array = {2, 4};
        int[] expectedResult = {4, 2, 3};

        MaxMinAve maxMinAve = new MaxMinAve();
        int[] actualResult = maxMinAve.returnMaxMinAve(array);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testReturnMaxMinAveTwoEqualElements() {
        int[] array = {1, 1};
        int[] expectedResult = {1, 1, 1};

        MaxMinAve maxMinAve = new MaxMinAve();
        int[] actualResult = maxMinAve.returnMaxMinAve(array);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }
}
