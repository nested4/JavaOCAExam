package ch5.casting.Q131;


class Vehicle {
	int x;  //x=10
	Vehicle() {
		this(10);// line n1
	}
	Vehicle(int x) {
		this.x = x;
	}
}
class Car extends Vehicle {
	int y; //y=20
	Car() {
		//super();
		this(20);// line n2
	}
	Car(int y) {
		this.y = y;
	}

	public String toString() {
		return super.x + ":" + this.y;
	}
}
public class Q131_Car{
	public static void main (String[] args) {
		Vehicle y = new Car(); 
		System.out.println(y);
	}
}


/*What is the result?  (same 13, review together)
A. 10:20								>> if it can be compiled
B. 0:20
C. Compilation fails at line n1 
D. Compilation fails at line n2			>>OK Why?
 */

/** Attention to
 
 1- !! this() and super() cannot exist together, because both want to be in the first place
 2-Order of Initialization  and accessing the correct constructor
 
 For the last operation-Casting: 
 FIGURE 5.6 Object vs. reference, p.280,281
 Conceptually, though, you should consider the object as the entity that exists in memory, allocated by the JRE. 
 	Regardless of the type of the reference you have for the object in memory, the object itself doesn’t change
 
 We can summarize this principle with the following two rules:
1. The type of the object determines which properties exist within the object in memory.
2. The type of the reference to the object determines which methods and variables are accessible to the Java program.
 */

