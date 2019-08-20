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

class RequirementFourTest {

	//Doesn't support negative numbers.
	@Test
	void test() {
		String formattedString = "1\n2,3\n-6,4,-2,-6";
		Calculator test = new Calculator(formattedString);
		
		int output = test.Add();
		assertEquals(10, output);
	}

}
