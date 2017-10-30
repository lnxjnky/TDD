public class SimpleCalc {
	public int add(String inputString) {
		int returnVal =0;
		String[] numbersArray = inputString.split(",|\n");

		for(String number: numbersArray)
		{
			if(!number.isEmpty())
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
		}
		return returnVal;
	}
}
