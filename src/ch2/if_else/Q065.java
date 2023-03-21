package ch2.if_else;

public class Q065 {
	public static void main(String[] args) {
        float var1 = (12_345.01 <= 123_45.00)? 12_456 : 124_56.02f;
        float var2 = var1 + 1024;
        System.out.print(var2);
       
    }

}

/*
65. What is the result?
A. An exception is thrown at runtime.
B. Compilation fails.
C. 13480.0
D. 13480.02		>> OK

 */

/**** NOTES
  if (12_345.01 <= 123_45.00)
     System.out.println(12_456);
  else
     System.out.println(124_56.02f);
 */
 
