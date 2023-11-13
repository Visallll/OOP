import java.util.Scanner;

public class EvenNumber{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for start and end numbers
        System.out.print("Enter the start number: ");
        int start = scanner.nextInt();

        System.out.print("Enter the end number: ");
        int end = scanner.nextInt();

        // Validate input
        while (start >= end || start % 2 != 0) {
            System.out.println("Invalid input. Please ensure start is less than end and start is even.");
            System.out.print("Enter the start number: ");
            start = scanner.nextInt();

            System.out.print("Enter the end number: ");
            end = scanner.nextInt();
        }

        // Display even numbers between start and end
        System.out.println("Even numbers between " + start + " and " + end + ":");

        while (start <= end) {
            System.out.print(start + " ");
            start += 2; // Increment by 2 to get the next even number
        }

        scanner.close();
    }
}
