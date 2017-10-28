public class SimpleCalc {
	public int add(String inputString) {
		String[] numbersArray = inputString.split(",");

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
