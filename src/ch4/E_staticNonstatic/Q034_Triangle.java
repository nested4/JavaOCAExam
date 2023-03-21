package ch4.E_staticNonstatic;

public class Q034_Triangle {
	static double area;
	int b= 2, h = 3;

	public static void main(String[] args) {
		double p,  b, h;				// line n1 
		if (area == 0) {		
			b = 3; 
			h = 4;
			p = 0.5;
			area = p * b * h;		// line n2
		}
		
		System.out.println("Area is " + area);
	}
}

/*What is the result?
A.	Area is 6.0		>>OK
B.	Area is 3.0
C.	Compilation fails at line n1
D.	Compilation fails at line n2.
*/

/** NOTES
attention to:
variable scope
accession limit : non-static to static is OK but static to non-static is NOT legal
*/