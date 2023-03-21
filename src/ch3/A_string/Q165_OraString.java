package ch3.A_string;

// Given
public class Q165_OraString {

	String s;
	public boolean equals (Q165_OraString str) {
		return this.s.equalsIgnoreCase(str.toString());
	}
	Q165_OraString(String s){
		this.s=s;
	}
	

	public static void main(String[] args) {

//		and the code fragment:
		String s1="Moon";

		Q165_OraString s2=new Q165_OraString("Moon");
		
		
		if ((s1=="Moon")&&(s2.equals("Moon"))) {
			System.out.println("A");
		}else {
			System.out.println("B");
		}
		
		if (s1.equalsIgnoreCase(s2.s)) {
			System.out.println("C");
		}else {
			System.out.println("D");
		}

	}
}

/* 165. What is the result? 
A. AC
B. BD
C. BC				>> OK
D. AD 
 */

/** NOTES
 !!! attention to Equality
 
 s2.equals("Moon") >> java.lang.Object.equals(), does not call the equals method of OraString at line 7
 s2.s.equals("Moon")
 
 
 Q165_OraString s3=new Q165_OraString("Moon");
 boolean eq=s2.equals(s3); 		// calls equals method of OraString at line 7
 boolean streq=s2.s.equals("Moon")
 
 
 this.s.equalsIgnoreCase(str.toString()); >> False, because str is an object
 object.toString()
 getClass().getName() + '@' + Integer.toHexString(hashCode())
 */



