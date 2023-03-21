package ch3.A_string;

public class Q078 {
	public static void main(String[] args) {
		String str1="Java";
		String []str2= {"J", "a","v","a"};
		String str4="Java";
		String str3="";
		for (String str:str2) {
			str3=str3+str;
		}
		boolean b1= (str1.equals(str3));
		boolean b2=(str1==str3);
		System.out.println(b1+", "+b2);


	}
}
/*
 What is the result?
A. false, false
B. false, true
C. true, false  			>> OK
D. true, true
 */

/**NOTES
 Understanding Equality, p.117
 '==' -> object equality, debug mode, observe object id
 String.equals() -> check equality of content

String x = "Hello World";
String y = "Hello World"; 
System.out.println(x == y); // true

!! String pool, p.105
Remember that Strings are immutable and literals are pooled. 
The JVM created only one literal in memory. 
x and y both point to the same location in memory; 
therefore, the statement outputs true.

String name = "Fluffy";
String name2 = new String("Fluffy");
The former says to use the string pool normally. 
The second says “No, JVM. I really don’t want you to use the string pool.
Please create a new object for me even though it is less efficient.” 

StringPool.Java
 */