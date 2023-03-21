package ch5.casting.Q177;

class Bird {
	public void fly() {
		System.out.println("Fly.");
	}
}

public class Peacock extends Bird {
	public void dance() {
		System.out.println("Dance.");
	}
	
	public static void main(String[] args) {
		/* insert code snippet here */
		
		p.fly();
		p.dance();
	}
}

/*Which code snippet can be inserted to print Fly.Dance. ?
 *
A.	>> p has a Bird reference so no access to methods of Peacock
	Bird p = new Peacock(); 

B.	>> Bird cannot be cast to Peacock (super to sub)
	Bird b = new Bird();   Peacock p = (Peacock) b;

C.	>> p has a Bird reference so no access to methods of Peacock
	Peacock b = new Peacock (); Bird p = (Bird) b;

D	OK >> needs an object p with both of types (reference and object) Peacock
	Bird b = new Peacock (); // limit access
	Peacock p = (Peacock) b; // restore the access rights

 * 
 */

