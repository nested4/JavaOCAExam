package ch5.casting.Q047;


class C1{
	int c1=10;
}

class C2 extends C1{
	int c2=20;
}

public class C3 extends C2 {
	int c3=30;

	public static void main(String[] args) {
		C1 obj1 = (C1)new C2();		// line 16 R1: sub to super, no need casting, just limiting the accession
		C2 obj2 = (C2)new C3();			// line 17 R1: sub to super, no need casting, just limiting the accession
		C2 obj3 = (C2)new C1();			// Line 18 R2: super to sub, an explicit cast to avoid completion fail, but R4 run time exception
		C3 obj4 = (C3)obj2; 			// line 19 Object type of obj2 is C3, so there is a C3 object in the memory, 
										   //Reassignment , restore all access rights
	}

}
//Which line throws ClassCastException?
//A.	line 18			>>OK, C1 cannot be cast to C2, no completion fail because of explicit cast but run time exception, Rule 4
//B.	line 17
//C.	line 19
//D.	line 16


/**
Here are some basic rules to keep in mind when casting variables:
1. Casting an object from a subclass to a superclass doesn’t require an explicit cast.
2. Casting an object from a superclass to a subclass requires an explicit cast.
3. The compiler will not allow casts to unrelated types.
4. Even when the code compiles without issue, an exception may be thrown at runtime 
	if the object being cast is not actually an instance of that class.

C2  to C1 >> OK
What is the result in this case:
C2 obj3 = new C1();	
*/