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

class RequirementThreeTest {

	//Supports newline character as alternative delimiter.
	@Test
	void test() {
		String formattedString = "1\n2,3\n-6,4";
		Calculator test = new Calculator(formattedString);
		
		int output = test.Add();
		assertEquals(4, output);
	}

}
