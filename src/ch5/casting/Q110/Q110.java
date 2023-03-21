package ch5.casting.Q110;

class Base {
	public void test(){
		System.out.println("Base ");
	}
}
class DerivedA extends Base{
	public void test(){
		System.out.println("DerivedA ");
	}
}
class DerivedB extends  DerivedA{
	public void test(){
		System.out.println("DerivedB ");
	}
}
public class Q110 {
	public static void main(String[] args) {
		Base b1=new DerivedB();
		Base b2=new DerivedA();
		Base b3=new DerivedB();
		b1=(Base)b3;
		Base b4=(DerivedA)b3;
		b1.test();
		b4.test();

	}
}
/*What is the result?  (Same 104)
A. BaseDerivedA
B. BaseDerivedB
C. DerivedBDerivedB		>>OK
D. DerivedBDerivedA
E. A ClassCastException is thrown at runtime.

 */

/** 
At the end, what are the object type and reference type
Base b1= new DerivedB() -> last assigned object is b3 and it was created with DerivedB
Base b4= new DerivedB()	-> last assigned object is b3 and it was created with DerivedB
*/
