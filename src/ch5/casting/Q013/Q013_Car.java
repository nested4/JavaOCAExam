package ch5.casting.Q013;

class Vehicle{
	int x;
	{System.out.println(this.x);}
	
	Vehicle(int x){
		this.x= x;
		System.out.println(this.x);
	}
	
}
class Car extends Vehicle{
	int y;
	{System.out.println( "y:"+this.y);}
	Car(){
		super(10);		// line n2
	}
	Car(int y){
		super(y); 
		//kendi clasinin static-non-saticlerini calistir
		this.y =y;
	}
	public String toString() {
		return super.x + ":" + this.y;
	}
}
public class Q013_Car{
	public static void main(String[] args) {
		Vehicle y = new Car(20);  
		System.out.println(y);
	}
}

/* What is the result?   (same 131, review together)
A.	Compilation fails at line n2.
B.	Compilation fails at line n1.
C.	20:20								>>OK
D.	10:20
 */
/** 
 !! first look at the topic inheritance
 
 Order of initialization
1-If there is a superclass, initialize it first
2-Static variable declarations and static initializers in the order they appear in the file.
3-Instance variable declarations and instance initializers in the order they appear in the file.
4-The constructor.

Further information for the last operation-Casting: 
 FIGURE 5.6 Object vs. reference, p.280,281
 Conceptually, though, you should consider the object as the entity that exists in memory, allocated by the JRE. 
 	Regardless of the type of the reference you have for the object in memory, the object itself doesn’t change
 
 We can summarize this principle with the following two rules:
1. The type of the object determines which properties exist within the object in memory.
2. The type of the reference to the object determines which methods and variables are accessible to the Java program.

 */

