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
		int count = 2, countTwo = 0;
		String delimiter = "", customDelimiter = "";
		numbers = new ArrayList<>();
		negNumbers = new ArrayList<>();
		
		//For requirement five.
		if(formattedString.charAt(0) != '/')
		{
			String[] values = formattedString.split("[,\n]");
			
			while(countTwo < values.length)
			{
				if(isNumeric(values[countTwo]))
				{
					int number = Integer.parseInt(values[countTwo]);

					if(0 > number)
						negNumbers.add(number);

					else if(number <= 1000)
						numbers.add(number);
				}

				else
					numbers.add(0);

				countTwo++;
			}
		}
		
		//For requirement six through eight formats.
		else
		{
			while(formattedString.charAt(count) != '\n')
			{
				if(formattedString.charAt(count) != '[' && formattedString.charAt(count) != ']')
				{
					//Metacharacters needing an escape sequence.
					if(formattedString.charAt(count) == '$' || formattedString.charAt(count) == '?' || formattedString.charAt(count) == '*' || formattedString.charAt(count) == '.') 
						customDelimiter += "\\" + formattedString.charAt(count);
					
					else
						customDelimiter += formattedString.charAt(count);
				}
				
				//Second case is incase we use a single character delimiter with no brackets.
				if(formattedString.charAt(count) == ']' || formattedString.charAt(count + 1) == '\n')
				{
					delimiter += customDelimiter + '|';
					
					customDelimiter = "";
				}
				count++;
			}
			
			delimiter += "[,\\n]";
			
			String newString = formattedString.substring(formattedString.indexOf('\n') + 1);
			
			String[] values = newString.split(delimiter);
			
			count = 0;
			
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
		String formula = "";
		
		for(int number : numbers)
		{
			sum += number;
			formula += "+" + number;
		}
		
		formula = formula.substring(1);
		formula += " = " + sum;
		System.out.println(formula);
		
		return sum;
	}
}