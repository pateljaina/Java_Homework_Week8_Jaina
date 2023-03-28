import java.util.Scanner;

/**
 * Write a program to input any number and check if it Armstrong number or not
 * 153 = (1*1*1)+(5*5*5)+(3*3*3)
 * where:
 * (1*1*1)=1
 * (5*5*5)=125
 * (3*3*3)=27
 * So:
 * 1+125+27=153
 */

public class Program10ArmstrongNumber {
    public static void main(String[] args) {//Main method
        int a, arm = 0, n, temp;
        Scanner scanner = new Scanner(System.in);//declare scanner
        System.out.println("Enter a number");//take user input
        n = scanner.nextInt();//store value from user
        scanner.close();
        temp = n;
        for (; n != 0; n /= 10)//method to check in armstrong number
        {
            a = n % 10;
            arm = arm + (a * a * a);
        }
        if (arm == temp)
            System.out.println(temp + " is a armstrong number ");//message to user if armstrong number
        else
            System.out.println(temp + " is not a armstrong number ");//message to user if not armstrong number
    }
}

