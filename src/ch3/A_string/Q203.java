package ch3.A_string;

public class Q203 {
    public static void main(String[] args) {
        String myStr = " Hello World ";
        myStr.trim();
        int i1 = myStr.indexOf(" ");
        System.out.println(i1);
    }
}
/*
What is the result?
A. An exception is thrown at runtime. 
B. -1
C. 5 				>> OK
D. 10
*/

/** NOTES
!! immutability
indexOf()-> 
1. Returns the index within this string of the first occurrence of the specified substring
2. If no such value of k exists, then -1 is returned.

?? What would be result with this usage
String myStr = " Hello World ";

myStr=myStr.trim();
*/