import java.util.Scanner;

/**
 * 1. Read 10 numbers from the console entered by the user and print the sum of those
 * numbers.
 * -Use the hasNextInt() method from the scanner to check if the user has entered an int value.
 * -If hasNextInt() returns false, print the message Invalid Number. Continue reading until you have read
 * 10 numbers.
 * -Use the nextInt() method to get the number and add it to the sum.
 * -Before the user enters each number, print the message Enter number #x: where x represents the
 * count, i.e. 1, 2, 3, 4, etc.
 * -For example, the first message printed to the user would be Enter number #1:, the next Enter number
 * #2:, and so on.
 * Hint:
 * -Use a while loop.
 * -Use a counter variable for counting valid numbers.
 * -Close the scanner after you don't need it anymore.
 * -Create a class with the name ReadingUserInputChallenge.
 */
public class Program1ReadingUserInputChallenge {
    public static void main(String[] args) {// Main method

        totalOf10Numbers();//Calling method of sum of the 10 numbers
    }

    public static void totalOf10Numbers() {
        Scanner scanner = new Scanner(System.in);// take input from scanner
        int count = 1;//use counter variable
        int sum = 0;
        while (count <= 10) {
            System.out.print("Enter Number #" + count + " :");//continues to read until 10 numbers
            boolean isAnInt = scanner.hasNextInt();//checking
            if (isAnInt) {
                int number = scanner.nextInt();
                sum = sum + number;
                count++;
            } else {
                System.out.println("Invalid Number");//false body
            }
            scanner.nextLine();
        }
        System.out.println("Total Sum of all numbers=" + sum);//prints sum of numbers
        scanner.close();
    }
}
