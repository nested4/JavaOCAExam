package ch4.F_constructor;

public class Q033_Employee {
	String name;
	boolean contract;
	double salary;
	Q033_Employee() {
		//line1

	}
	

	public String toString() {
		return name + ":" + contract + ":" + salary;	
	}
	
	public static void main(String[] args) {
		Q033_Employee e = new Q033_Employee();
		// line2
	
		System.out.println(e);		
	}
}
/* 
  Which two modifications, when made independently, enable the code to print Joe:true:100.0 ? ( Choose Two)

  		A: Replace line2 with:
		 	e.name = "Joe";
		 	e.contract = true;
			e.salary = 100;

		B: Replace line2 with:
		 	this.name = "Joe";  		// this. cannot be  used in static content / main method
		 	this.contract = true;
			this.salary = 100;

		C: Replace line n1 with:
			this.name = new String("Joe");
			this.contract = new Boolean(true);
			this.salary = new Double(100);

		D: Replace line n1 with: 
		 	name = "Joe";
		 	contract = TRUE;  			//  TRUE gives complitaion error, primitive boolean -> true or false 
			salary = 100.0f;

		E: Replace line n1 with:
			this("Joe", true, 100);  	// could be used to call a constructor with 3 parameters

 */

/** !! move this topic to ch5
 * NOTES
 * Creating Constructor, p.196
 A constructor is typically used to initialize instance variables. 
 The this keyword tells Java you want to reference an instance variable. Most of the time, this is optional
 When this is used as if it were a method, Java calls another constructor on the same instance of the class.
 this() >> to call the constructor method, parameter list is important .
 
 Output w/o any change ==> null:false:0.0 
  
 'toString()'  : override the existence method  	
	if there is an toString() method (override operation) call this method.
	if there is no override  toString() method, call the object's method.
		result is hash code of object : packageName.objectName@<<hascode>>
											 ch4.Q033_Employee@7852e922

we can print the object without calling toString()
	System.out.println(e);		
	System.out.println(e.toString());		
		


 
 */

