package ch5.inheritance.Q024;

class A{
	
	public A() {
		System.out.print("A ");
	}
}
class B extends A{
	public B() {
		System.out.print("B ");
	}
}
public class Q024_C extends B{
	public Q024_C() {
		System.out.print("C");
	}
	public static void main(String[] args) {
		Q024_C c = new Q024_C();
	}
}

/*What is the result?   (same 79)
A.	C B A
B.	C
C.	A B C				>>OK
D.	Compilation fails at line n1 and line n2
*/

/** Attention to Order of initialization, no super() but Java call it
 */
 
