package ch1.packages.q169.clothing.pants;

import ch1.packages.q169.clothing.Shirt;


////package clothing
//public class Shirt {
//	public static String getColor() {
//		return "Green";
//
//	}
//}

//package clothing.pants;
//line n1 
import static ch1.packages.q169.clothing.Shirt.getColor;

public class Jeans {
	
	public void matchShirt() {
		//line n2       >>  
		String color = getColor();
		if(color.equals("Green")) {
			System.out.println("FIT");
		}
	}

	public static void main(String[] args) {
		Jeans trouser = new Jeans ();
		trouser.matchShirt();

	}

}

/*
Which two sets of actions, independently, enable the code fragment to print Fit?
A. At line n1 insert: import clothing.Shirt; At line n2 insert: String color = Shirt.getColor(); >>OK
B. At line n1 insert: import clothing; At line n2 insert: String color = Shirt.getColor();
C. At line n1 insert: import static clothing.Shirt.getColor; At line n2 insert: String color = getColor(); >>OK
D. At line n1 no changes required. At line n2 insert: String color = Shirt.getColor();
E. At line n1 insert: import Shirt; At line n2 insert: String color = Shirt.getColor(); 
*/

/**
 !!Attention special type of import called the “static import” that imports other types (ch4)
 */
