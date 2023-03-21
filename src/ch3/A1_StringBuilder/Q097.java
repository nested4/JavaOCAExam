package ch3.A1_StringBuilder;

public class Q097 {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder("Java");
		String s = "Java";                        
		if (sb.toString().equals(s.toString())){
			System.out.println("Match 1");
		}else if(sb.equals(s)){
			System.out.println("Match 2");
		}else {
			System.out.println("No Match");   

		}
		
	}
}
/*
		What is the result?
		A. Match 1					>> OK
		B. Match 2
		C. No Match
		D. A NullPointerException is thrown at runtime. 

 */

/**NOTES
 Object.equals >> object comparison
  this method returns true if and only if x and y refer to the same object 

 */

/*second version
StringBuilder sb = new StringBuilder(5);
String s = "";
if (sb.equals(s)){
  System.out.println("Match 1");
}else if(sb.toString().equals(s.toString())){
  System.out.println("Match 2");
}else {
  System.out.println("Not Match");
}

third version

StringBuilder sb = new StringBuilder("Java");
String s = "Java";
if(sb.equals(s)){
  System.out.println("Match 1");
}else {
  System.out.println("Not Match");
}
*/
