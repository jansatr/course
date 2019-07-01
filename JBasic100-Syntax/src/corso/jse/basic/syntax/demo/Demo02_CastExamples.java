package corso.jse.basic.syntax.demo;

public class Demo02_CastExamples {

	public static void main(String[] args) {
		
		long aLongVar=100L;
		int anIntegerVar= 10;
		int aVeryBigInteger= 1000_000_000;
		//int aVeryBigInteger= 1000;
		
		//1) Cast implicit
		//aLongVar=anIntegerVar;
		
		
		//2) cast explicit (Mandatory)
		//anIntegerVar=(int) aLongVar;
		
		//3) Temp var in calculation
		//long result= (aVeryBigInteger*aVeryBigInteger)/aVeryBigInteger;// allowed but result is wrong!
		// System.out.println("result: "+result);
		
		//4) A better version var in calculation
		 long result= aVeryBigInteger*(long)aVeryBigInteger/aVeryBigInteger;
		 System.out.println("result: "+result);
		 
		 //5) Most common with Double and literals
		 double aDoubleVar = 15/(double)4;
		 System.out.println("result: "+aDoubleVar);
	}

}
