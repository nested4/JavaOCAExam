package ch5.abstrct.Q054;

public abstract class Toy {
	public abstract int calculatePrice(Toy t);					
	public void printToy(Toy t) { /* code goes here*/}									
}

/* 54. You are asked to develop a program for a shopping application, and you are given this information:

The application must contain the classes Toy, EduToy, and ConsToy. 
The Toy class is the superclass of the other two classes.
The int calculatePrice (Toy t) method calculates the price of a toy.
The void printToy (Toy t) method prints the details of a toy.

Which definition of the Toy class adds a valid layer of abstraction to the class hierarchy?
*/

// A. 	>>OK
//		public abstract class Toy{											// In an abstract class: 
//		public abstract int calculatePrice(Toy t);							// OK, The abstract methods have no body
//		public void printToy(Toy t) { /* code goes here*/}					// OK, The nonabstract methods have body
//	}


// B.	>> This method requires a body instead of a semicolon
//		public abstract class Toy{											
//		public  int calculatePrice(Toy t);									// nonabstract with no body 
//		public void printToy(Toy t);										// nonabstract with no body 
//	}

//C. 	>> This method requires a body instead of a semicolon
//		public abstract class Toy{
//		public  int calculatePrice(Toy t);									// nonabstract with no body
//		public final void printToy(Toy t) { /* code goes here*/}			// OK, final, nonabstract, stop override
//	}


// D.	>> Abstract methods do not specify a body
//		public abstract class Toy{
//		public abstract int calculatePrice(Toy t) { /* code goes here*/}	// abstract with body 
//		public abstract void printToy(Toy t) { /* code goes here*/}			// abstract with body
//	}


