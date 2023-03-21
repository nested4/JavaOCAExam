package ch5.abstrct.Q045;

abstract class Planet{
	protected void revolve() {		// line n1
	}
	abstract  void rotate();				// line n2
}

class Earth extends Planet{
	  void revolve() {		// line n3
	}
	protected void rotate() {		// line n4
	}
}
/*Which two modifications, made independently, enable the code to compile? (Choose two.)   (Same 76)
		A. 	Make the method at line n1 public.
		B.	Make the method at line n2 public.
		C.	Make the method at line n3 public. 			>>
		D.	Make the method at line n3 protected. 		>>
		E.	Make the method at line n4 public.
*/
/** Attention to overriding
Rule 2. The method in the child class must be at least as accessible or more accessible than the method in the parent class.

TABLE 4.2 Access modifiers, p.180
 private (in class) < default (in package) < protected (in package or subclasses)< public  (any)
 */