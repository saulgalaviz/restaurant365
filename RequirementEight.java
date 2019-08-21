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

class RequirementEight {

	//Supports multiple amount of new custom length custom delimiters.
	@Test
	void test() {
		String formattedString = "//[*][!!][rrr]\n11rrr22*33!!44";
		Calculator test = new Calculator(formattedString);
		
		int output = test.Add();
		assertEquals(110, output);
	}

}
