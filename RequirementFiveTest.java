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

class RequirementFiveTest {

	//Doesn't support numbers over 1000.
	@Test
	void test() {
		String formattedString = "2,1001,6";
		Calculator test = new Calculator(formattedString);
		
		int output = test.Add();
		assertEquals(8, output);
	}

}
