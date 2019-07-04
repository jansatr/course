package corso.jse.basic.syntax.day1exercises;

import org.junit.Test;

//import course.jse.basic.methods.libs.ArrayUtils;
import junit.framework.Assert;


public class LabelRectangleTest {

	@Test
	public void testMin()
	{
		//given	
		int [] input1 = {10, 12, 2009};
		int [] input2 = {12, 12, 2009};
		int expected=2;
		//when...
		int actualResult= TestClass.BetweenTheDates(input1, input2);
		
		//then...
		Assert.assertEquals(expected, actualResult);
		//Assert.assertEquals(expected, actualResult);
	}
	
	
}
