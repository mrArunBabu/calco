import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class IfSampleTest {

	@Test
	public void testNegativeNumber() {
	    // Set up input and output streams for testing
	    String input = "-3\n"; // Simulate user input of "-3"
	    InputStream in = new ByteArrayInputStream(input.getBytes());
	    System.setIn(in);

	    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(outContent));

	    // Call the main method of IfSample class
	    IfSample.main(null);

	    // Check the output
	    assertEquals("enter a number\nthe number is negative\n", outContent.toString());
	}
}
