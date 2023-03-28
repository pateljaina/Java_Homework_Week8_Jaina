import java.util.Scanner;

/**
 * Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */
public class Program9FibonacciNumber {
    public static void main(String[] args)//Main method
    {
        int n, a = 0, b = 0, c = 1;
        Scanner s = new Scanner(System.in);//Declaring Scanner
        System.out.print("Enter required series of numbers:");//User to input how many fibonacchi numbers required
        n = s.nextInt();//storing value
        System.out.print("Fibonacci Series:");
        for(int i = 1; i <= n; i++)//for loop
        {
            a = b;
            b = c;
            c = a + b;
            System.out.print(a+" ");
        }
    }
}
