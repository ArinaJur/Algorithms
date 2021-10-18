public class FizzBuzzWoof {

    public void printFizzBuzzWoof(int n) {
        if (n > 1 && n < 100) {
            for (int i = 1; i <= n; i++) {
                if (i % 3 != 0 && i % 5 != 0 && i % 7 != 0
                        && i % 10 != 3 && i / 10 != 3
                        && i % 10 != 5 && i / 10 != 5
                        && i % 10 != 7 && i / 10 != 7) {
                    System.out.print(i);
                }
                if (i % 3 == 0) {
                    System.out.print("Fizz");
                }
                if (i == 3 || i % 10 == 3 || i / 10 == 3) {
                    System.out.print("Fizz");
                }
                if (i % 5 == 0) {
                    System.out.print("Buzz");
                }
                if (i == 5 || i % 10 == 5 || i / 10 == 5) {
                    System.out.print("Buzz");
                }
                if (i % 7 == 0) {
                    System.out.print("Woof");
                }
                if (i == 7 || i % 10 == 7 || i / 10 == 7) {
                    System.out.print("Woof");
                }

                System.out.print(" ");
            }
        }
    }

    public boolean divisibleBy(int a, int i) {
        if (i % a == 0) {
            return true;
        }

        return false;
    }

    public boolean contains(int a, int i) {
        if (i % 10 == a && i / 10 == a || i % 10 == a || i / 10 == a) {
            return true;
        }

        return false;
    }

    public boolean containsDouble(int a, int i) {
        if (i % 10 == a && i / 10 == a) {
            return true;
        }

        return false;
    }

    public String returnString(int n) {
        String result = "";

        if (n > 1 && n < 100) {
            for (int i = 1; i <= n; i++) {
                if (!divisibleBy(3, i) && !divisibleBy(5, i) && !divisibleBy(7, i)
                        && !contains(3, i)
                        && !contains(5, i)
                        && !contains(7, i)) {
                    result = result + i;
                }
                if (divisibleBy(3, i)) {
                    result += "Fizz";
                }
                if (contains(3, i)) {
                    result += "Fizz";
                }
                if (containsDouble(3, i)) {
                    result += "Fizz";
                }
                if (divisibleBy(5, i)) {
                    result += "Buzz";
                }
                if (contains(5, i)) {
                    result += "Buzz";
                }
                if (containsDouble(5, i)) {
                    result += "Buzz";
                }
                if (divisibleBy(7, i)) {
                    result += "Woof";
                }
                if (contains(7, i)) {
                    result += "Woof";
                }
                if (containsDouble(7, i)) {
                    result += "Woof";
                }

                result += " ";
            }
        }

        return result;
    }
}
