import java.util.Scanner;

public class EscapeCha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for the sentence
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // Replace escape characters
        String replacedSentence = sentence
                .replaceAll("\\\\n", "(new_line)")
                .replaceAll("\\\\t", "(tab)")
                .replaceAll("\\\\\\\\", "(slash)")
                .replaceAll("//", "(comment_line)")
                .replaceAll(":\\)", "(smile)");

        // Display the result
        //System.out.println("Original Sentence: " + sentence);
        System.out.println("Modified Sentence: " + replacedSentence);

        scanner.close();
    }
}
