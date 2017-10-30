public class SimpleCalc {
	public int add(String inputString) {
		String delimiter = ",|\n";
	    String numbersWithoutDelimiter = inputString;
	    if (inputString.startsWith("//")) {
	        int delimiterIndex = inputString.indexOf("//") + 2;
	        delimiter = inputString.substring(delimiterIndex, delimiterIndex + 1);
	        numbersWithoutDelimiter = inputString.substring(inputString.indexOf("\n") + 1);
	        
	    }
	    return addHelper(numbersWithoutDelimiter, delimiter);
	}
	
	private static int addHelper(final String numbers, final String delimiter) {
	    int returnValue = 0;
	    String[] numbersArray = numbers.split(delimiter);
	    for (String number : numbersArray) {
	        if (!number.trim().isEmpty()) {
	        	int currentNumber = Integer.parseInt(number.trim());
	        	if(currentNumber < 0)
	        	{
	                throw new RuntimeException("Negative numbers not allowed");
	        	}
	        	else
	        	{
	        		returnValue += currentNumber;
	        	}
	        }
	    }
	    return returnValue;
	}
}
