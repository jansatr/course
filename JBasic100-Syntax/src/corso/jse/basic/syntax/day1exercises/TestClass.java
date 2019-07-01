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
