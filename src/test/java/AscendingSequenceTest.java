import org.junit.Assert;
import org.junit.Test;

public class AscendingSequenceTest {

    @Test
    public void testASHappyPath() {
        int a = 10;
        int b = 25;
        int n = 5;
        int[] expectedResult = {10, 15, 20, 25};

        AscendingSequence ascendingSequence = new AscendingSequence();
        int[] actualResult = ascendingSequence.ascendingSequence(a, b, n);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testNegativePath1() {
        int a = 10;
        int b = -25;
        int n = -5;
        int[] expectedResult = {-1};

        AscendingSequence ascendingSequence = new AscendingSequence();
        int[] actualResult = ascendingSequence.ascendingSequence(a, b, n);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testNegativePath2() {
        int a = 10;
        int b = 10;
        int n = 2;
        int[] expectedResult = {-1};

        AscendingSequence ascendingSequence = new AscendingSequence();
        int[] actualResult = ascendingSequence.ascendingSequence(a, b, n);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }
}
