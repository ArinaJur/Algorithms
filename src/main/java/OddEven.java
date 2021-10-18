public class OddEven {

    public String checkOddEven(long number) {
        if (number <= Integer.MAX_VALUE && number >= Integer.MIN_VALUE) {
            if (number % 2 == 0) {

                return "Even";
            } else if (Math.abs(number % 2) == 1) {

                return "Odd";
            }
        }

        return "Undefined";
    }
}
