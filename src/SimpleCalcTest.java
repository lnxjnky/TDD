import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;


public class SimpleCalcTest {
	
	private static SimpleCalc calc;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		calc = new SimpleCalc();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	
	@Test (expected = RuntimeException.class)
	public void whenNegativeNumberInputThenThrowException() {
		int value = calc.add("-1,1");
		
	}
	
	@Test
	public void whenMoreThanTwoInputThenReturnValidResult(){
		int value = calc.add("1,2,3");
		Assert.assertEquals(1+2+3, value);
	}
	
	@Test
	public void whenValidInputThenCheckForResult(){
		int value = calc.add("1,2");
		
		Assert.assertEquals(1+2, value);
		
	}
	
	@Test
	public void whenValidInputWithThreeParamsThenCheckForResult(){
		int value = calc.add("1,2,3");
		
		Assert.assertEquals(1+2+3, value);
		
	}
	
	@Test
	public void whenValidInputWithOneParamThenCheckForResult(){
		int value = calc.add("1");
		
		Assert.assertEquals(1, value);
		
	}
	
	@Test
	public void whenValidInputWithZeroParamsThenCheckForResult(){
		int value = calc.add("");
		
		Assert.assertEquals(0, value);
		
	}
	
	@Test
	public final void whenNewLineIsUsedBetweenNumbersThenReturnValuesAreTheirSums() {
	    Assert.assertEquals(3+6+15, calc.add("3,6\n15"));
	}
	
	@Test
	public final void whenDelimiterIsSpecifiedThenItIsUsedToSeparateNumbers() {
	    Assert.assertEquals(3+6+15, calc.add("//-\n3-6-15"));
	}

}
