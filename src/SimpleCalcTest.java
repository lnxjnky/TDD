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
	
	@Test (expected = RuntimeException.class)
	public void whenMoreThanTwoInputThenThrowException(){
		int value = calc.add("1,2,3");
	}
	
	@Test
	public void whenValidInputThenCheckForResult(){
		int value = calc.add("1,2");
		
		Assert.assertEquals(1+2, value);
		
	}

}
