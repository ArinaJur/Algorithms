public class AsDisSequencesSumDif {

    public int countResult(int n) {
        int result = 0;

        if (n > 1) {
            for (int i = 1; i <= n; i++) {
                result += i;
            }
        } else if (n < 1) {
            result = 1;
            for (int i = 0; i >= n; i--) {
                result -= i;
            }
        }

        return result;
    }
}
