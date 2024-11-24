import java.util.ArrayList;

public class TextLogic {
    private ArrayList<String> lines;  // Store all the lines of text entered by user
    private int characterCount;        // Store total number of characters
    private String longestWord;       // Store the longest word we find

    // Constructor that initializes variables
    public TextLogic () {
        lines = new ArrayList<>(); // Initialize the list to store the lines of text
        characterCount = 0;  // Initialize characterCount to 0 since no text has been added yet
        longestWord = ""; // Initialize longestWord as an empty string since no word has been encountered yet
    }

    // Adds a new line and updates the statistics
    public void addText(String line) {
        lines.add(line); // Adds the given line to the list of lines
        characterCount += line.length(); // Increases the total number of characters by the length of the new line

        // Split the line into words and update the longest word if necessary
        for (String word : line.split("\\s+"))
            // Check if the current word is longer than the longestWord found so far
            if (word.length() > longestWord.length()) {
                // If so, update the longestWord to be the current word
                longestWord = word;
            }
    }

    // Returns number of lines
    public int getLineCount() {
        return lines.size();
    }

    // Returns total character count
    public int getCharacterCount() {
        return characterCount;
    }

    // Counts and returns total number of words
    public int getWordCount() {
        int wordCount  = 0;
        for (String line  : lines) {
            // Split each line into words and count them
            // This handles multiple spaces and other whitespace characters
            wordCount  += line .split("\\s+").length;
        }
        return wordCount ;
    }

    // Returns the longest word found
    public String getLongestWord() {
        return longestWord;
    }

    // Checks if user entered stop command
    public boolean checkIfStop(String rad) {
        return rad.equalsIgnoreCase("stop");
    }
}
