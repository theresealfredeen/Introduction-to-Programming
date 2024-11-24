import java.util.Scanner;

public class TextProgram {

    public static void main(String[] args) {
        // Create an instance of TextLogic to handle text analysis
        TextLogic analysis = new TextLogic();
        Scanner scanner = new Scanner(System.in);


        System.out.println("Please write at least one line of text, preferably more for analysis.");
        System.out.println("Write \"stop\" to end:");
        System.out.println("--------------------------------");

        // Read text line until user types "stop"
        while (true) {
            String input  = scanner.nextLine();
            // Check if user typed "stop" and exit the loop
            if (analysis.checkIfStop(input )) {
                break; // Ends the loop if the user types "stop"
            }
            analysis.addText(input ); // Adds the line to the analysis class
        }
        //Check if any text was entered before showing results
        if (analysis.getLineCount() == 0) {
            System.out.println("You did not enter any text. Please try again!");
        }
        else {
            // Display analysis results
            System.out.println("-----------------------------------");
            System.out.println("Here`s what I found:");
            System.out.println("Number of lines: " + analysis.getLineCount());
            System.out.println("Number of characters " + analysis.getCharacterCount());
            System.out.println("Number of words: " + analysis.getWordCount());
            System.out.println("Longest word: " + analysis.getLongestWord());

        }
    }

}



