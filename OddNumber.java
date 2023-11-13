import java.util.Scanner;

public class OddNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for start and end numbers
        System.out.print("Enter the start number: ");
        int start = scanner.nextInt();

        System.out.print("Enter the end number: ");
        int end = scanner.nextInt();

        // Validate input
        while (start >= end) {
            System.out.println("Invalid input. Please ensure the start number is less than the end number.");
            System.out.print("Enter the start number: ");
            start = scanner.nextInt();

            System.out.print("Enter the end number: ");
            end = scanner.nextInt();
        }

        // Display odd numbers between start and end
        System.out.println("Odd numbers between " + start + " and " + end + ":");

        // Ensure start is odd to start with
        if (start % 2 == 0) {
            start++; // Increment start to the next odd number
        }

        while (start <= end) {
            System.out.print(start + " ");
            start += 2; // Increment by 2 to get the next odd number
        }

        scanner.close();
    }
}
