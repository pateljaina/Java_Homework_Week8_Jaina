import java.util.Scanner;

/**
 * 2. -Read the numbers from the console entered by the user and print the minimum
 * and maximum number the user has entered.
 * -Before the user enters the number, print the message Enter number:
 * -If the user enters an invalid number, break out of the loop and print the minimum and maximum
 * number.
 * Hint:
 * -Use an endless while loop.
 * -Create a class with the name MinAndMaxInputChallenge.
 */
public class Program2MinAndMaxInputChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//declare scanner
        System.out.println("Enter numbers limit");//ask user to enter length of numbers required
        int ar = sc.nextInt();//store value into array

        if (ar < 0)
            System.out.println("invalid number");//invalid if less than 0
        else {
            int[] a = new int[ar];
            int i = 0;
            while (i < a.length) {
                System.out.println("Enter number" + (i + 1) + " : ");
                a[i] = sc.nextInt();
                i++;
            }
            minMax(a);//using javas pre defined method
        }
        sc.close();
    }
    public static void minMax(int[] array) {
        int max = 0, min = 0, x = 0;
        while (x < array.length) {
            if (x == 0)
                max = min = array[x];
            else if (array[x] > max) {
                max = array[x];
            } else if (array[x] < min)
                min = array[x];
            x++;
        }
        System.out.println("Max number entered is " + max);
        System.out.println("Min number entered is " + min);
    }
}

