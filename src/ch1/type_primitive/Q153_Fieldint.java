package ch1.type_primitive;
public class Q153_Fieldint { //public	class Fieldint

	Character c;
	boolean b;
	float f;
	void printAll() {
		System.out.println("c= "+c);
		System.out.println("b= "+b);
		System.out.println("f= "+f);
	}

	public static void main(String[] args) {
		Q153_Fieldint f=new Q153_Fieldint();
		f.printAll();
	}
}

/* What is the result? (exact the same 026 and same 143)
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