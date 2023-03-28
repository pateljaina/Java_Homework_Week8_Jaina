import java.util.Scanner;

/**
 * Write a program in Java to display the pattern like a triangle with a number.
 *  For eg.
 *  Input number of rows: 10
 *  Expected Output:
 *  1
 *  12
 *  123
 *  1234
 *  12345
 *  123456
 *  1234567
 *  12345678
 *  123456789
 *  12345678910
 */
public class Program6JavaTriangle {
    public static void main(String[] args)//Main method
    {
        int i,j,n;
        System.out.print("Input number of rows : ");//Asking user to define size of triangle in rows
        Scanner in = new Scanner(System.in);//declare scanner
        n = in.nextInt();//get input from user

        for(i=1;i<=n;i++)//for loop
        {
            for(j=1;j<=i;j++)
                System.out.print(j);

            System.out.println("");
        }
    }
}

