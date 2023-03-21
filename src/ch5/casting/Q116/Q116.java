package ch5.casting.Q116;
class A{
	public void test(){
		System.out.println("A");
	}
}
class B extends A{
	public void test(){
		System.out.println("B");
	}
}
 class C extends A {
	public void test() {
		System.out.println("C");
	}
}
public class Q116 {
	public static void main(String[] args) {
		A b1=new A();
		A b2=new C();
		
		b1=(A)b2;      //line1
		A b3=(B) b2;   //line2 C cannot be cast to B
		b1.test();
		b3.test();
	}
}
/*What is the result?  (same 86)
A. AB
B. AC
C. CC
D. A ClassCastException is thrown only at line n1.
E. A ClassCastException is thrown only at line n2.		>> OK, Rule 3 & 4: C and B are unrelated


 */