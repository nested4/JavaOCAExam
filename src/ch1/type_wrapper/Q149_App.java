package ch1.type_wrapper;

public class Q149_App {  //public class App
	public static void main(String[] args) {
		Boolean[] bool = new Boolean[2];
		bool[0] = new Boolean(Boolean.parseBoolean("true"));
		bool[1] = new Boolean(null);

		System.out.println(bool[0] + " " + bool[1]);

	}
}


/*
149. What is the result?
A True False			>>OK
B. True null
C. Compilation fails
D. A NullPointerException is thrown at runtime


Second Version
this is changed
bool[0] = new Boolean("1");
bool[1]=new Boolean(boolean.parseBoolean("true"));
System.out.println(bool[0]+" "+bool[1]);

answer is =>  false true


 */
/**** NOTES
 1.Parses the string argument as a boolean. 
 The boolean returned represents the value true:
  if the string argument is not null and is equal, ignoring case, to the string "true".
  
2. wrapper class is an object, so null value can be assigned.
 ******/


