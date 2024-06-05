import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class MultyTableTest {

    @Test
    public void testMultiplicationTable() {
        // Set up input and output streams for testing
        String input = "5\n"; // Simulate user input of "5"
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Call the main method of MultyTable class
        MultyTable.main(null);

        // Check the output
        String expectedOutput = "enter a number to print multyplication table\n" +
                                "the multiplication table for 5 is...\n" +
                                "1*5=5\n" +
                                "2*5=10\n" +
                                "3*5=15\n" +
                                "4*5=20\n" +
                                "5*5=25\n" +
                                "6*5=30\n" +
                                "7*5=35\n" +
                                "8*5=40\n" +
                                "9*5=45\n" +
                                "10*5=50\n";
        assertEquals(expectedOutput, outContent.toString());
    }
}
