import java.util.Scanner;

/**
 * Write a programme to input any number and check if it is prime or not.
 * (Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
 * prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13,
 * 17.... are the prime numbers.)
 */
public class Program12PrimeOrNot {
    public static void main(String[] args) {//main method
        Scanner scanner = new Scanner(System.in);//declare scanner
        System.out.println("Enter a number to check if it is prime number or not: ");
        int number = scanner.nextInt();//take input from user
        if (isPrime(number)) {//if else method
            System.out.println(number + " is prime number");
        } else {
            System.out.println(number + " is a non-prime number");
        }
    }
    static boolean isPrime(int num) {//if, for loop method
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if ((num % i) == 0)
                return false;
        }
        return true;
    }
}
