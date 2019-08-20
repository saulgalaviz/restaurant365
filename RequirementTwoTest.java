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

class RequirementTwoTest {

	//Can support an unlimited amount of numbers.
	@Test
	void test() {
		String formattedString = "21,tytyt,-6,2";
		Calculator test = new Calculator(formattedString);
		
		int output = test.Add();
		assertEquals(17, output);
	}

}
