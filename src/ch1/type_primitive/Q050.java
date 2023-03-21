package ch1.type_primitive;

public class Q050 {
	public static void main(String[] args) {
		//		double y1 = 203.22; float fit = (float) y1; //Type mismatch: cannot convert from double to float
		
		double y1 = 203.22; 
		
		float fit =  (float) y1;
		
		
		

		float fit1 = (float) 1_11.0;

//		Float fit2  =  100.00; 						// Type mismatch: cannot convert from double to Float
		Float fit2  =  100.00f; 	

		int y2 = 100; 
		float fit3=  y2;

		float fit4 = 100.00f;
		
	}
}

/*
Which two code fragments cause compilation errors? (Choose two.) 
A. double y1 = 203.22; float fit = y1;			>> OK
B. float fit = (float) 1_11.00;
C. Float fit = 100.00;    						>> OK
D. int y2 = 100; float fit = (float) y2; 
E. float fit = 100.00F; 


 */


/**** NOTES

1. Java will automatically promote from smaller to larger data types,
 but it will throw a compiler exception if it detects you are trying to convert from larger to smaller data types.
	byte > short> int > long (l-L)>  float (f-F)> double (d-D)
	reverse conversion, need casting
	
? number to char,String or boolean
? char to int >> possible or not  (ASCII)
 *****/
