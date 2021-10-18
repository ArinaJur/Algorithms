import org.junit.Assert;
import org.junit.Test;

public class AsDisSequencesSumDifTest {

    @Test
    public void testAsSequenceSum() {
        int n = 222;
        int expectedResult = 24753;

        AsDisSequencesSumDif asDisSequencesSumDif = new AsDisSequencesSumDif();
        int actualResult = asDisSequencesSumDif.countResult(n);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testDisSequenceDif() {
        int n = -10;
        int expectedResult = 56;

        AsDisSequencesSumDif asDisSequencesSumDif = new AsDisSequencesSumDif();
        int actualResult = asDisSequencesSumDif.countResult(n);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testNegative() {
        int n = 1;
        int expectedResult = 0;

        AsDisSequencesSumDif asDisSequencesSumDif = new AsDisSequencesSumDif();
        int actualResult = asDisSequencesSumDif.countResult(n);

        Assert.assertEquals(expectedResult, actualResult);
    }
}
