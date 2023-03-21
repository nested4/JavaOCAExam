package ch1.type_primitive;

public class Q081 {
	public static void main(String[] args) {

		float flt=100.00F;

		float flt2=(float)111.00;

		Float flt3=100.00; 				// Type mismatch: cannot convert from double to Float

		double y1=203.22; float flt=y1;  // Type mismatch: cannot convert from double to float
		
		int y2=100; float flt5=(float)y2;
	}	
}


/*
81. Which two code fragments cause a compilation error?(Choose two.)
A.float flt=100.00F;
B.float flt=(float)1_11.00;
C.Float flt=100.00;
D.double y1=203.22; float flt=y1;
E.int y2=100;float flt=(float)y2;

 */

/***** NOTES
 1: You can have underscores in numbers to make them easier to read, p.23
 *****/
