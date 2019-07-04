package corso.jse.basic.syntax.day1exercises;

public class TestClass {
	
	public static int day(int input)
	//For checking inserted day (don't take account February and months with 30 days
	{
		if (input >0 && input < 32) input = 1;
		else input = 0;
		return input;
	//	return input;
		
	}

	public static int month(int input)
	//For checking inserted month 
	{
			if (input >0 && input < 13) input = 1;
			else input = 0;
			return input;	
		
	}

	public static int year(int input) 
	//For checking inserted year
	{
		if (input >0 && input < 10000) input = 1;
		else input = 0;
		return input;	
	}
	
	public static String CompareArrays(int [] array1, int [] array2)
	{
		
		String result = null;
		if (array1.length == array2.length)
		{
			for (int i=0; i<array1.length; i++)
			{
				if (array1[i]!=array2[i])
				{
					result = "Not equal!";
					System.out.println(result);
					break;
				}
			}
		}
		else
		{
			result = "Not equal! Lengths are different";
			System.out.println("result");
		}

		return result;
	}
	
	public static String SortArray(int [] array2)
	{
		int temp=0;
		for (int i=0; i<array2.length; i++)
		{
			for (int j=0; j<array2.length;j++)
			{
				if (array2[j] > array2[i])
				{
					temp=array2[i];
					array2[i]=array2[j];
					array2[j]=temp;
				}
			}
		}
		for (int i=0; i<array2.length; i++)
		{
			
			System.out.println("Array: " + array2[i] );
		}
		return null;
		
	}
	
	public static int BetweenTheDates(int[] input1, int [] input2) 
	{
		int DaysInYear=365;
		int DaysInMonth=31;
		int days=0;
		for (int i=input1.length -1; i>-1; i-- )
		{
			if ( input2[i]>input1[i])
			{
				if (i==2) 
					{
					int year= input2[i] - input1[i];
					days=days+(year*DaysInYear);
					}
				else if (i==1)
				{
					int month= input2[i] - input1[i];
					days=days+(month*DaysInMonth);
				}
				else if (i==0)
				{
					days=days+ input2[i] - input1[i];
				}
			}					
		}
		return days;
	}
}
