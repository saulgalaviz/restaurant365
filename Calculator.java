package R365;
/**
 * Create a calculator that only supports an Add operation given a single formatted string
 *
 * Restaurant365 Coding Assessment
 *
 * Saul Galaviz
 */
import java.util.List;
import java.util.ArrayList;

public class Calculator 
{
	private List<Integer> numbers;
	private List<Integer> negNumbers;
	
	//Constructor which formats our passed formatted string.
	public Calculator(String formattedString)
	{
		String delimiter = "[,\\n" + formattedString.charAt(2) + "]";
		String newString = formattedString.substring(4);
		
		String[] values = newString.split(delimiter);
		
		numbers = new ArrayList<>();
		negNumbers = new ArrayList<>();
		
		int count = 0;
		
		while(count < values.length)
		{
			if(isNumeric(values[count]))
			{
				int number = Integer.parseInt(values[count]);
				
				if(0 > number)
					negNumbers.add(number);
				
				else if(number <= 1000)
					numbers.add(number);
			}
			
			else
				numbers.add(0);
			
			count++;
		}
		
		if(0 < negNumbers.size())
			negativeValues();
		
	}
	
	//Function which print negative values from formatted string.
	private void negativeValues()
	{
		try {
			String exceptionString = "";
			
			for(int negNumber : negNumbers)
				exceptionString = exceptionString + negNumber + ',';
			
			throw new Exception("Negative numbers such as: " + exceptionString + " aren't allowed.");
			
		} catch (Exception e) {
			System.err.println((e.getMessage() + "\n"));
		}
	}
	
	//Function which checks if a value is numeric or not.
	private boolean isNumeric(String value) 
	{
	    try {
	        Integer.parseInt(value);
	    } catch (NumberFormatException | NullPointerException nfe) {
	    	return false;
	    }
	    return true;
	}
	
	//Function which adds numbers from the formatted string.
	public int Add()
	{
		int sum = 0;
		
		for(int number : numbers)
			sum += number;
		
		return sum;
	}
}