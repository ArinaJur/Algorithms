import org.junit.Assert;
import org.junit.Test;

public class OddIndexesValuesTest {
    @Test
    public void testOddIndexesValues() {
        int[] array = {-45, 590, 234, 985, 12, 68};
        int[] expectedResult = {590, 985, 68};

        OddIndexesValues oddIndexesValues = new OddIndexesValues();
        int[] actualResult = oddIndexesValues.returnValuesOfOddIndexes(array);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddIndexesValues1() {
        int[] array = {2};

        OddIndexesValues oddIndexesValues = new OddIndexesValues();
        int[] actualResult = oddIndexesValues.returnValuesOfOddIndexes(array);

        Assert.assertArrayEquals(null, actualResult);
    }
}
