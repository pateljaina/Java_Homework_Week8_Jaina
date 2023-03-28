import java.util.Scanner;

/**
 * Display right angle triangle of @ using nested for loops
 *             @
 *             @@
 *             @@@
 *             @@@@
 *             @@@@@
 */

public class Program8RightAngleTriangle {
    public static void main(String args[])// Main method
    {
        Scanner scanner = new Scanner(System.in);//Declaring scanner
        System.out.println("Please insert number of rows required");//user to input how many rows required
        int n=scanner.nextInt();//storing value
        int a, b;
        for(a = 0; a < n; a++) {//for loop
            for(b = 0; b <= a; b++) {
                System.out.print("@");
                scanner.close();
            }
            System.out.println();
        }
    }

}
