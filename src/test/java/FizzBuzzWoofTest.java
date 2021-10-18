import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzWoofTest {

    @Test
    public void testFizzBuzzWoof() {
        int n = 99;
        String expectedResult = "1 2 FizzFizz 4 BuzzBuzz Fizz WoofWoof 8 Fizz Buzz " +
                "11 Fizz Fizz Woof FizzBuzzBuzz 16 Woof Fizz 19 Buzz FizzWoof " +
                "22 Fizz Fizz BuzzBuzz 26 FizzWoof Woof 29 FizzFizzBuzz Fizz Fizz " +
                "FizzFizzFizz Fizz FizzBuzzBuzzWoof FizzFizz FizzWoof Fizz FizzFizz " +
                "Buzz 41 FizzWoof Fizz 44 FizzBuzzBuzz 46 Woof Fizz Woof BuzzBuzz " +
                "FizzBuzz Buzz FizzBuzz FizzBuzz BuzzBuzzBuzz BuzzWoof FizzBuzzWoof " +
                "Buzz Buzz FizzBuzz 61 62 FizzFizzWoof 64 BuzzBuzz Fizz Woof 68 " +
                "Fizz BuzzWoofWoof Woof FizzWoof FizzWoof Woof FizzBuzzBuzzWoof " +
                "Woof WoofWoofWoof FizzWoof Woof Buzz Fizz 82 Fizz FizzWoof BuzzBuzz " +
                "86 FizzWoof 88 89 FizzBuzz Woof 92 FizzFizz 94 BuzzBuzz Fizz Woof Woof Fizz ";

        FizzBuzzWoof fizzFizzFizz = new FizzBuzzWoof();
        //fizzBuzzWoof.printFizzBuzzWoof(n);
        String actualResult = fizzFizzFizz.returnString(n);

        Assert.assertEquals(expectedResult, actualResult);
    }
}
