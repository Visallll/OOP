import java.util.Scanner;

public class Palindrome {

        public static boolean isPalindromeUsingReverse(String str) {
            String reversed = new StringBuilder(str).reverse().toString();
            return str.equalsIgnoreCase(reversed);
        }

        public static boolean isPalindromeUsingLoop(String str) {
            int length = str.length();
            for (int i = 0; i < length / 2; i++) {
                if (str.charAt(i) != str.charAt(length - 1 - i)) {
                    return false;
                }
            }
            return true;
        }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

                    System.out.print("Please enter a word to check: ");
                    String input = scanner.nextLine();

                    System.out.print("Choose method (REV, LOOP): ");
                    String method = scanner.nextLine().toUpperCase();

                    if (method.equals("REV")) {
                        if (Palindrome.isPalindromeUsingReverse(input)) {
                            System.out.println(input + " is a Palindrome.");
                        } else {
                            System.out.println(input + " is not a Palindrome.");
                        }
                    } else if (method.equals("LOOP")) {
                        if (Palindrome.isPalindromeUsingLoop(input)) {
                            System.out.println(input + " is a Palindrome.");
                        } else {
                            System.out.println(input + " is not a Palindrome.");
                        }
                    } else {
                        System.out.println("Invalid method choice. Please choose either REV or LOOP.");
                    }
        scanner.close();
    }    
        
    }
