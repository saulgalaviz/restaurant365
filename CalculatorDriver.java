package R365;
/**
 * Create a calculator that only supports an Add operation given a single formatted string
 *
 * Restaurant365 Coding Assessment
 *
 * Saul Galaviz
 */
public class CalculatorDriver 
{
	public static void main(String[] args)
	{
		String formattedString = "2,1001,6";
		Calculator calc = new Calculator(formattedString);
		
		System.out.println(calc.Add());
	}
}