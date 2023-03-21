package ch5.inheritance.Q079;

class A {
	public A() {
		System.out.println("C ");
	}
}
class B extends A {
	public B(){     //line n1
		System.out.println("B ");
	}
}

class C extends B {
	public C(){      // line n2
		System.out.println("A ");
	}
	public static void main(String[] args) {
		C c = new C(); 
	}
}
/*
    What is the result?   (same 24)
    A. C B A			>> OK
    B. C
    C. A B C
    D. Compilation fails at line n1 and line n2
  
 */

/** Attention to Order of initialization, no super() but Java call it
 */

