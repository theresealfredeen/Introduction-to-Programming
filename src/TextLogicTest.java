import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TextLogicTest {
    // Test for checking the number of lines added to the TextLogic object
    @Test
    void getLineCount() {
        TextLogic logic = new TextLogic();  // Create a new TextLogic object
        logic.addText("Hello and welcome!");  // Add a line of text
        logic.addText("How are you today?");  // Add another line of text
        assertEquals(2, logic.getLineCount());  // Verify that the total line count is 2
    }

    @Test
    void testCharacterCount() {
        TextLogic logic = new TextLogic();
        logic.addText("I love programming");
        assertEquals(18, logic.getCharacterCount());
    }

    @Test
    void testWordCount() {
        TextLogic logic = new TextLogic();
        logic.addText("This has been an educational course.");
        assertEquals(6, logic.getWordCount(), "Should be 6 words.");

    }


    @Test
    void testLongestWord() {
        TextLogic logic = new TextLogic();
        logic.addText("Which postal area in Sweden has the longest name?");
        logic.addText("Skummeslövsstrand");
        assertEquals("Skummeslövsstrand", logic.getLongestWord());
    }

}
