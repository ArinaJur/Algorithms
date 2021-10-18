public class OddIndexesValues {

    public int[] returnValuesOfOddIndexes(int[] array) {
        if (array.length > 1) {
            int[] newArray = new int[array.length / 2];
            int j = 1;
            for (int i = 0; i < newArray.length; i++) {
                newArray[i] = array[j];
                j = j + 2;
            }

            return newArray;
        }

        return null;
    }


}
