package ch1.type_primitive;

public class Q143_Fieldint { //Public class Fieldinit
	
	
	char c;
	boolean b;
	float f;
	void printAll() {
		System.out.println("c= "+c);
		System.out.println("b= "+b);
		System.out.println("f= "+f);
	}
	public static void main(String[] args) {
		Q143_Fieldint f=new Q143_Fieldint();
		f.printAll();
	}

}

/* What is the result? (same 026- 153)
A.	c=
	b = false
	f = 0.0
	
B.	c= null
	b = true
	f = 0.0

C.	c= 0
	b = false
	f = 0.0f

D.	c= null
	b = false
	f = 0.0F
*/