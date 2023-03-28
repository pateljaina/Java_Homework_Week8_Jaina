/**
 * Even Digit Sum
 * Write a method named getEvenDigitSum with one parameter of type int called number.
 * The method should return the sum of the even digits within the number.
 * If the number is negative, the method should return -1 to indicate an invalid value.
 * EXAMPLE INPUT/OUTPUT:
 * * getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
 * * getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
 * * getEvenDigitSum(-22); → should return -1 since the number is negative
 * NOTE: The method getEvenDigitSum should be defined as public static
 */
public class Program11EvenDigitSum {
    public static int getEvenDigitSum(int number) {
        int a;
        int even = 0;
        int odd = 0;

        if (number > 0) {//method to get sum of even digit numbers
            while (number != 0) {
                a = number % 10;
                if (a % 2 == 0) {
                    even = even + a;
                } else {
                    odd = odd + a;
                }
                number = number / 10;
            }
            System.out.println("Sum of even numbers: " + even);
        } else {
            System.out.println("-1 number is negative");//return for invalid value
            return -1;
        }
        return even;
    }

    public static void main(String[] args) {//calling into main method
        getEvenDigitSum(123456789);
        getEvenDigitSum(252);
        getEvenDigitSum(-22);
    }
}
