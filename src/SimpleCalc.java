public class SimpleCalc {
	public int add(String inputString) {
		String[] numbersArray = inputString.split(",");
		if(numbersArray.length > 2)
		{
			throw new RuntimeException("Max 2 numbers allowed");
		}
		for(String number: numbersArray)
		{
			if(Integer.parseInt(number) < 0)
			{
				throw new RuntimeException("Negative not allowed");
			}
		}
		return 0;
	}
}
