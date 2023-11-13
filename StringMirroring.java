import java.util.Scanner;

public class StringMirroring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for the string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Create a palindrome by making a reverse copy
        String reversed = new StringBuilder(inputString).reverse().toString();
        String palindrome = inputString + reversed;

        // Display the result
        System.out.println("Original String: " + inputString);
        System.out.println("Palindrome: " + palindrome);

        scanner.close();
    }
}
