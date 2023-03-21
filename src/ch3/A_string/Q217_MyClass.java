package ch3.A_string;

public class Q217_MyClass {
    public static void main(String[] args) {
        String s="Java SE 8 1";
        int len=s.trim().length();
        System.out.println(len);
    }
}
/*What is the result?
A. Compilation fails.
B. 11						>> OK
C. 8						>> why not ?
D. 9						
E. 10

 */
