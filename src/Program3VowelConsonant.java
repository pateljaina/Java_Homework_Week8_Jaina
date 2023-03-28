import java.util.Scanner;

/**
 * Write a Java program that takes the user to provide a single character from the
 * alphabet. Print Vowel of Consonant, depending on the user input. If the user input
 * Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
 * error message.
 * For eg:
 * Input an alphabet: p
 * Expected Output:
 * Input letter is Consonant
 */
public class Program3VowelConsonant {
    public static void main(String[] args) {//Main method
        Scanner scanner = new Scanner(System.in);//Declare scanner to acquire input from user
        System.out.println("Please provide single character from the alphabet: ");
        String letter = scanner.next().toLowerCase();
        scanner.close();
        if (letter.length() != 1 || !Character.isLetter(letter.charAt(0))) {//condition if user input is not letter
            System.out.println("Error: Please enter a single letter.");//displays error message
        } else if (letter.equals("a") || letter.equals("e") || letter.equals("i") ||
                letter.equals("o") || letter.equals("u")) {//conditions stating vowels
            System.out.println("Input letter is Vowel");//message to user
        } else {
            System.out.println("Input letter is Consonant");//message to user
        }
    }
}
