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
	
	//Constructor which formats our passed formatted string.
	public Calculator(String formattedString)
	{
		String[] values = formattedString.split(",");
		numbers = new ArrayList<>();
		
		int count = 0;
		
		while(count != 2 && count < values.length)
		{
			if(isNumeric(values[count]))
				numbers.add(Integer.parseInt(values[count]));
			
			else
				numbers.add(0);
			
			count++;
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