package ch3.A1_StringBuilder;

public class Q042 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("A");
		sb.append("A");
		sb.append("A");
		sb.append("A");
		
		
        System.out.println("before delete: " + sb);
		
		sb.delete(2, sb.length());  
	
		System.out.println("after delete: " + sb);

	}
}

/*
 42. Which statement will empty the contents of a StringBuilder variable named sb? 
A. sb. deleteAll ();
B. sb. delete (0, sb. size () );
C. sb. delete (0, sb. length () );		>>OK
D. sb. removeAll ();

 */

/** NOTES
StringBuilder.delete(int start, int end)
??  size() or length()

!! make a method list to remember easily
Important StringBuilder Methods, p.114


**/