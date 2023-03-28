import java.util.Scanner;

/*
 * Java method to check if a number is palindrome or not
 */
public class Program5PalindromeNo {
    public static void main(String[] args) {//Main Method
        System.out.println("Please Enter a number : ");//Acquiring user input
        Scanner scanner = new Scanner(System.in);//declaring scanner
        int a = scanner.nextInt();//taking input from user
        boolean check = isPalindrome(a);//calling isPalindrome method

        if (check) {
            System.out.println("Number is a palindrome");//true body
        } else {
            System.out.println("Number is not a palindrome");//false body
        }
    }

    public static boolean isPalindrome(int number) {//method to check if number is palindrome number
        int palindrome = number;
        int reverse = 0;
        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }
        if (number == reverse) {
            return true;
        }
        return false;
    }
}

