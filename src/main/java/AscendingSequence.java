public class AscendingSequence {

    public int[] ascendingSequence(int a, int b, int n) {

        if (b > a && n > 0) {
            int[] asArray = new int[(b - a)/n + 1];

            for (int i = 0; i < asArray.length; i++) {
                asArray[i] = a;
                a += n;
            }

            return asArray;
        }

        return new int[]{-1};
    }
}
