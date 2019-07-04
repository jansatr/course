package corso.jse.basic.syntax.day1exercises;
import java.util.Scanner;
import corso.jse.basic.syntax.day1exercises.TestClass;

public class LabelRectangleArea {
	static Scanner scanner= new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Easy
	//	RectangleArea();
	//	WeekDay();
	//	InRange();
	//	Array();
		
		//Intermediate
		//Dates();
		//Primenumber();
		//ATM();
		
		//Advanced
		Arrays();
		
		//Varia
		//SortFromSmallest();
	}

	private static void Dates() {
		// TODO Auto-generated method stub
		int [] date1 = {10, 12, 2009};
		int [] date2 = {12, 12, 2009};
		int earlier=0;
		int DaysBetween=0;
		for (int i=date1.length-1; i>-1; i-- )
			{
				if (date1[i]< date2[i])
				{
					earlier=1;
					System.out.println("Date1 is earlier!" );
					DaysBetween=TestClass.BetweenTheDates(date1, date2);
					System.out.println("Days between: " + DaysBetween);
					break;
				}
				else if (date1[i]> date2[i])
				{
					earlier=2;
					System.out.println("Date2 is earlier!" );
					break;
				}
			}
		if (earlier==0) System.out.println("Same dates" );
		
		//inserting new date 
		
		//day
		int day=0;
		int CheckedDay=0;
				do {
					System.out.println("Please insert date");
					day = scanner.nextInt();
					CheckedDay = TestClass.day(day);
				
				}while (CheckedDay==0);
				
		//month		
		int month=0;		
		int CheckedMonth=0;
				do {
					System.out.println("Please insert month");
					month = scanner.nextInt();
					CheckedMonth = TestClass.month(month);						
				}while (CheckedMonth==0);
				
		//year		
		int year=0;		
		int CheckedYear=0;
				do {
					System.out.println("Please insert year");
					year = scanner.nextInt();
					CheckedYear = TestClass.year(year);						
				}while (CheckedYear==0);
				
				
		int date3 [] = {day, month, year };	
		int between=1;
		if (earlier==1)
			{
				for (int i=date3.length-1; i>-1; i--)
					{
						if (date3[i] < date1[i] || date3[i] > date2[i] )between=0;break;	
												
					}
				if (between==1) System.out.println("Date3 is between Date1 and Date2");	
			}
		else if (earlier==2)
			{
				for (int i=date3.length-1; i>-1; i--)
					{
						if (date3[i] > date1[i] || date3[i] < date2[i] ) between=0;break;
					}
				if (between==1) System.out.println("Date3 is between Date2 and Date1");	
			}
		
		
		}	

	

	private static void Arrays() {
		// TODO Auto-generated method stub
		int [] array1 = {50, 20, 10, 5, 12, 20};
		int [] array2 = {50, 20, 10, 5, 12};
		
		TestClass.CompareArrays(array1, array2);
		
		TestClass.SortArray(array2);
//		
//		if (array1.length == array2.length)
//		{
//			for (int i=0; i<array1.length; i++)
//			{
//				if (array1[i]!=array2[i])
//				{
//					System.out.println("Not equal!");
//					break;
//				}
//			}
//		}
//		else
//		{
//			System.out.println("Not equal! Lengths are different");
//		}
//		int temp=0;
//		for (int i=0; i<array2.length; i++)
//		{
//			for (int j=0; j<array2.length;j++)
//			{
//				if (array2[j] > array2[i])
//				{
//					temp=array2[i];
//					array2[i]=array2[j];
//					array2[j]=temp;
//				}
//			}
//		}
//		for (int i=0; i<array2.length; i++)
//		{
//			
//			System.out.println("Array: " + array2[i] );
//		}
	}

	private static void ATM() {
		// TODO Auto-generated method stub

		System.out.println("How much you need?");
		int money = scanner.nextInt();
		int [] notes = {50, 20, 10, 5, 2};
		for (int i=0; money!=0; i++ )
		{
			int note = money/notes[i];
			money=money-(note*notes[i]);			
			if (note != 0)	System.out.println("Banknote: " + notes[i] + " quantity: " + note );
		}

	}

	private static void Primenumber() {
		// TODO Auto-generated method stub						
		int input = 0;
		do {
			System.out.println("Insert a number 0 - 1000");
			input = scanner.nextInt();
		}
		while (input <1 || input > 1000 );
		
		int prime = 0;
		 if (input <= 1) {
			 prime = 1;
			 System.out.println("Not prime number");
			 
		 } 
		 
		 for (int i = 2; i < input; i++) 
	            if (input % input == 0) 
	                 
		 {
	            	prime=1;
	            	System.out.println("Not prime");
		 break;
		 }
		 if (prime!=1) System.out.println("Prime");				
		
		
	}

	private static void SortFromSmallest() {
		// TODO Auto-generated method stub
		int [] numbers = {1,2,3,4,10,6,7,8,9,5};
		int temp = 0;
		for (int i = 0; i<numbers.length; i++)
		{
			for (int j = 0; j<numbers.length; j++)
			if (numbers[i]  > numbers[j])
			{
				temp=numbers[j];
				numbers[j] = numbers[i];
				numbers[i] = temp;
			}
			
		}
		
		for (int i=0; i<numbers.length; i++)
			
		{
		System.out.println("Number " + numbers[i]);
		}
	}

	private static void Array() {
		// TODO Auto-generated method stub
		int [] numbers={1,2,3,4,10,6,7,8,9,5};
		int max = 0;
		for (int i=0; i<numbers.length; i++)
		{
			if (numbers[i]  > max)
			{
				max=numbers[i];
			}
			
		}
		System.out.println("Biggest number is " + max);
		
	}

	private static void InRange() {
		// TODO Auto-generated method stub
		System.out.println("Insert a number 0 - 100");
		int input = scanner.nextInt();
				
		if (input > 100)
		{
			System.out.println("Please check the number " + input+ "it's bigger than 100");
			
		}
		else
		{
			System.out.println("Nice work, you inserted " + input);
		}
		
	}

	private static void WeekDay() {
		// TODO Auto-generated method stub
		System.out.println("Insert a weekday number");
		
		
		int anInput=scanner.nextInt();
		
		switch (anInput) {

		case 1:
			System.out.println("Monday");
			 break;
		case 2:
			System.out.println("Tuesday");
			 break;
		case 3:
			System.out.println("Wednesday");
			 break;
		case 5:
			System.out.println("Friday");
			 break;
		case 7:
			System.out.println("Sunday");
			 break;
		case 4:
			System.out.println("Thursday");
			 break;
		case 6:
			System.out.println("SAturday");
			 break;

		default:
			System.out.println("Wrong day!");
		}
	}

	private static void RectangleArea() {
		// TODO Auto-generated method stub
		
		
		System.out.println("Insert an width");
		
		
		int Width=scanner.nextInt();
		
		System.out.println("Inserted "+Width);
		
		System.out.println("Insert height");
		
		int height=scanner.nextInt();
		
			
		System.out.println("Inserted " +height);
		
		int result=Width*height;
		
		System.out.println("Result " +result);
	}


	
}
