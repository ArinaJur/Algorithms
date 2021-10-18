public class MaxMinAve {

    public int[] returnMaxMinAve(int[] array) {
        if (array.length == 1) {

            return new int[]{array[0], array[0], array[0]};
        }

        int max = array[0];
        int min = array[0];
        int sum = 0;

        if (array.length == 2) {
            if (array[0] >= array[1]) {
                min = array[1];
                max = array[0];
            } else {
                min = array[0];
                max = array[1];
            }
            sum = array[0] + array[1];
        } else {
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
                if (i > 0) {
                    if (array[i] < min) {
                        min = array[i];
                    } else if (array[i] > max) {
                        max = array[i];
                    }
                }
            }
        }

        return new int[]{max, min, sum/array.length};
    }
}
