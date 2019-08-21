package R365;
/**
 * Create a calculator that only supports an Add operation given a single formatted string
 *
 * Restaurant365 Coding Assessment
 *
 * Saul Galaviz
 */
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

class RequirementSeven {

	//Supports a new custom length custom delimiter.
	@Test
	void test() {
		String formattedString = "//[***]\n11***22***33";
		Calculator test = new Calculator(formattedString);
		
		int output = test.Add();
		assertEquals(66, output);
	}

}
