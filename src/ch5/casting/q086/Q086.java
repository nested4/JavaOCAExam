package ch5.casting.q086;

class A {
	public void test() {
		System.out.println("A ");
	}
}
class B extends A {
	public void test(){     
		System.out.println("B ");
	}
}

class C extends A {
	public void test(){      
		System.out.println("C ");
	}
}
public class Q086 {
	public static void main(String[] args) {
		A b1 = new A();
		A b2 = new C();
		A b3 = (B) b2;  // line n1  b2 is an C object in memory 
		b1 = (A) b2;  // line n2
		b1.test();
		b3.test();

	}
}
/*
    What is the result?  (same 116)
    A. AB
    B. AC
    C. CC
    D. A ClassCastException is thrown only at line n1.		>> Rule 3 & 4, C can not cast to B because they are unrelated
    E. A ClassCastException is thrown only at line n2.
 */
/**
    Here are some basic rules to keep in mind when casting variables:
    1. Casting an object from a subclass to a superclass doesn’t require an explicit cast.
    2. Casting an object from a superclass to a subclass requires an explicit cast.
    3. The compiler will not allow casts to unrelated types. 
    4. Even when the code compiles without issue, an exception may be thrown at runtime 
    	if the object being cast is not actually an instance of that class.
 
At the end, what are the object type and reference type
A b1= (B) new C()	-> last assigned object is b2 and it was created with C, C to B is not ok, not related
A b3= (A) new C()	-> last assigned object is b2 and it was created with C, C to A is ok, related

in this line  A b2 = new C();
a C object is wearing an A costume. Rule 1:  doesn’t require an explicit cast
So, in this line A b3 = (B) b2;
rule 3 has been passed with this masking. Compiler dosen't know what is actual object in the memory.  

1-What happens in this case (without masking):
C b2 = new C();
 
2-Comment line 23 and 26, then it can run. In this case:
If A has no test method, what happens?
 

 
 *
 */
