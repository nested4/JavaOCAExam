package ch1.type_primitive;
public class Q140 {
	public static void main(String[] args) {
		int iVar = 100;
		float fVar = 100.100f;
		double dVar = 123;
		fVar = iVar;
		iVar = fVar; 			//Type mismatch: cannot convert from float to int 
		fVar = dVar;			//Type mismatch: cannot convert from double to float
		dVar = fVar;
		iVar = dVar;			//Type mismatch: cannot convert from double to int
		dVar = iVar;
	}
}

/* which three lines fail to compile? (choose three.)
A. Line 7
B. Line 8
C. Line 9
D. Line 10
E. Line 11
F. Line 12

Answer: BCE


    Second Version
    the question was same but number of lines was changed.
    ivar=fvar was at line 8.
    fvar=dvar at line 9.
    ivar= dvar at line 11.
    be careful at line numbers.
 */

/**** NOTES
 int to float is OK  		>> kucuk buyuge olur 
 float to int is NOT OK 	>> buyuk kucuge olmaz, casting is needed
 
******/