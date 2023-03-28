/**
 * 14. Write a program in Java to display the pattern like a diamond.
 *  While loop
 *  *
 *  ***
 *  *****
 *  *******
 *  *********
 * ***********
 * *************
 * ***********
 *  *********
 *  *******
 *  *****
 *  ***
 *  *
 */
public class Program14Diamond {
    public static void main(String args[]) {
        int number = 7;//Declare and initialise variables
        int m = 1;//Diamonds starts with single star in first row
        int n;

        while (m <= number) {//loop - prints first half of diamond
            n = 1;
            while (n++ <= number - m) {// Prints space until n++ <= number - m is false

                System.out.print(" ");// Print spaces in between stars
            }
            n = 1;

            while (n++ <= m * 2 - 1) {//Prints star until n++ <= m * 2 - 1 is false

                // Print star
                System.out.print("*");
            }
            System.out.println();
            m++;// Incrementing as we want pyramid generation
            //Top half of diamond printed
        }
        m = number - 1;

        while (m > 0) {//Prints the second half diamond
            n = 1;
            while (n++ <= number - m) {// Prints spaces until n++ <= number - m is false
                System.out.print(" ");//Print space between stars
            }
            n = 1;
            while (n++ <= m * 2 - 1) {// Prints star until n++ <= m * 2 - 1 is false
                System.out.print("*");//Print star
            }
            System.out.println();

            m--; //decrementing, for bottom half of diamond
        }
    }
}
