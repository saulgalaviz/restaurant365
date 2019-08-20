package R365;
/**
 * Create a calculator that only supports an Add operation given a single formatted string
 *
 * Restaurant365 Coding Assessment
 *
 * Saul Galaviz
 */
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class RequirementSixTest {

	//Supports a new single custom delimiter.
	@Test
	void test() {
		String formattedString = "//;\n2;5\n8";
		Calculator test = new Calculator(formattedString);
		
		int output = test.Add();
		assertEquals(15, output);
	}

}
