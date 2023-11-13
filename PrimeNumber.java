import java.util.Scanner;

public class PrimeNumber{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a number: ");
        int userInput = scanner.nextInt();

        // Validate input
        while (userInput <= 2) {
            System.out.println("Please enter a number greater than 2.");
            System.out.print("Enter a number: ");
            userInput = scanner.nextInt();
        }

        System.out.println("Prime numbers from 2 to " + userInput + ":");
        int number = 2;

        while (number <= userInput) {
            if (isPrime(number)) {
                System.out.print(number + " ");
            }
            number++;
        }

        scanner.close();
    }

    // Function to check if a number is prime
    private static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        int i = 2;
        while (i <= num / 2) {
            if (num % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
}
