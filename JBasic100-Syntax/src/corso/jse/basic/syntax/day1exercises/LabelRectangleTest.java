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
	
	@Test 
	public void testArrayCompare()
	{
		//given
		int [] array1 = {50, 20, 10, 5, 12, 20};
		int [] array2 = {50, 20, 10, 5, 12};
		String expected="Not equal! Lengths are different";
		//when
		 String Result= TestClass.CompareArrays(array1, array2);
		//then
		Assert.assertEquals(expected, Result);
		
		
	}
	
	
}
