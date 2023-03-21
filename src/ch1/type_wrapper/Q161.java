package ch1.type_wrapper;

public class Q161 {

	public static void main(String[] args) {
		//Boolean  available = true;
		Boolean available = new Boolean(Boolean.valueOf("TRUE"));
		String tmAuthor="author",author="MC Donald";
		Double price =200D;
		Integer pages =20;
		

	}
}

/*
 161. Which two initialization statements are valid? (Choose two.) 
 A. Boolean available = "TRUE"; 	>> Type mismatch: cannot convert from String to Boolean (“TRUE” is String, not bool)
 B. String tmpAuthor = author, author ="Mc Donald";		>> author cannot be resolved to a variable (variable usage without  declaration)
 C. Double price = 200D;	>> OK
 D. Integer pages = 20;		>> OK
 */
