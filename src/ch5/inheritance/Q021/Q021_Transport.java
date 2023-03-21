package ch5.inheritance.Q021;

class Vehicle {
	Vehicle(){
		System.out.println("Vehicle");
	}
}
class Bus extends Vehicle{
	Bus(){
		System.out.println("Bus");
	}
}
public class Q021_Transport {
	public static void main(String[] args) {
		Vehicle v = new Bus();
	}
}
/*What is the result?
A.	Vehicle 			>>OK
		Bus
B.	Bus
		Vehicle
C.	Bus
D.	The program doesn’t print anything

*/


/** Attention to Order of initialization, no super() but Java call it
 */
