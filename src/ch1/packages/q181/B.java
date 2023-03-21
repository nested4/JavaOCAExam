package ch1.packages.q181;

public class B {
	
	private int doStuff(){
//		private int x = 100; //Illegal modifier for parameter x; only final is permitted
		int x=100; 
		return x++;
	}
}

/***** NOTES
1: no modifier declaration for local variable
2: A local variable is a variable defined within a method. 
	1: must be initialized before use. 
	2: no default value :
	3: with uninitialized value, compiler error

*******/
