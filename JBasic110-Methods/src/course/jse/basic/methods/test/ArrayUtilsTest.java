package course.jse.basic.methods.test;

import org.junit.Test;

import course.jse.basic.methods.libs.ArrayUtils;
import junit.framework.Assert;

public class ArrayUtilsTest {
	
	
	@Test
	public void testMin()
	{
		//given
		int [] testData= {1,2,3,4,10};
		int expected=1;
		//when...
		int actualResult=ArrayUtils.min(testData);
		
		//then...
		Assert.assertEquals(expected, actualResult);
		//Assert.assertEquals(expected, actualResult);
	}

	
	public void m() {
		
	}
	
	
	@Test(expected = NullPointerException.class)
	public void testMin_shouldThrowExceptionForEmptyData() {
		//given
		int [] testData= null;
		

		//int expected=1;
		//when...
		int actualResult=ArrayUtils.min(testData);
		
		//then...
		Assert.fail("Expected exception was not thrown");
		//Assert.assertEquals(expected, actualResult);
	}
}
