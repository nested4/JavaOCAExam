package ch5.interfc.q066;

//given
interface I {
	public void displayI();
}

abstract class C2 implements I {
	public void displayC2() {
		System.out.print("C2");
	}
}

class C1 extends C2 {
	public void displayI() {
		System.out.print("C1");
	}
}

public class Q066 {
	public static void main(String[] args) {
		
		// And the code fragment:
		C2 obj1 = new C1();
		I obj2 = new C1();

		C2 s = (C2) obj2;
		I t = obj1;
		t.displayI();
		s.displayC2();

	}
}
/*What is the result?		(same 70)
A. C1C2			>>OK
B. C1C1
C. Compilation fails.
D. C2C2
 */

/** 
!! Check if there is any unimplemented method
!! Attention to casting and the type of reference and object
 */

