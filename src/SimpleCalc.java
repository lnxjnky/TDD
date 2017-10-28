public class SimpleCalc {
	public int add(String inputString) {
		int returnVal =0;
		String[] numbersArray = inputString.split(",");

		for(String number: numbersArray)
		{
			int currentNum = Integer.parseInt(number);
			if(currentNum < 0)
			{
				throw new RuntimeException("Negative not allowed");
			}
			else
			{
				returnVal += currentNum;
			}
		}
		return returnVal;
	}
}
