package ch5.casting.q104;

//Base.java:
class Base{
	public void test(){
		System.out.println("Base ");
	}
}

// DerivedA.java:
class DerivedA extends Base {
	public void test() {
		System.out.println("DerivedA ");
	}
}
//DerivedB.java:
class DerivedB extends DerivedA {
	public void test () {
		System.out.println("DerivedB ");
	}
}

public class Q104 {
	public static void main (String[] args) {
		Base b1 = new DerivedB();
		Base b2 = new DerivedA();
		Base b3 = new DerivedB();
		Base b4 = b3; //new DerivedB(); limited access in compile time
		b1 = (Base) b2; //new DerivedA(); no need casting, just limited access
		b1.test();
		b4.test();
	}

}
/*
 *What is the result?  (Same 110)
A. BaseDerivedA
B. BaseDerivedB
C. DerivedBDerivedB			
D. DerivedBDerivedA			
E. A ClassCastException is thrown at runtime. 

My answer: DerivedA DerivedB 

 */
/** Object vs. Reference, p.282
We can summarize this principle with the following two rules:
1. The type of the object determines which properties exist within the object in memory.
2. The type of the reference to the object determines which methods and variables are accessible to the Java program.

At the end, what are the object type and reference type
Base b1= new DerivedA()	-> last assigned object is b2 and it was created with DerivedA
Base b4= new DerivedB()	-> last assigned object is b3 and it was created with DerivedB
*/





