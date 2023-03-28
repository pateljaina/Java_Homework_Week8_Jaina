/**
 * 15. Display left angle triangle of * using nested for loops
 */

public class Program15LeftTriangleNestedForLoop {
    public static void StarleftTriangle(int k) {
        int a, b;

        // 1st loop
        for (a = 0; a < k; a++) {//1st loop
            // nested 2nd loop
            for (b = 2 * (k - a); b >= 0; b--) {//2nd loop
                // printing spaces
                System.out.print(" ");//print spaces in between
            }
            for (b = 0; b <= a; b++) {//3rd loop
                // printing stars
                System.out.print("* ");//Print Stars
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {//Main method
        int k = 5;
        StarleftTriangle(k);
    }
}
