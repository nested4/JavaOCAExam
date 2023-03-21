package ch1.mainFunc;

public class G_Q220_MainTest { //public class MainTest
    public static void main(String[] args) {
        System.out.println("String main "+args[0]);
    }
}

/* and commands:
javac MainTest.java
java MainTest "1 2 3"

what is the result?
        A. String main 1				>> spaces in quotes (" ") are ignored >> NOT OK
        B. An exception is thrown at runtime
        C. String main 1 2 3			>> everything in quotes (" ") is one argument >> OK
        D. String main 123
*/


/*** Notes:
 * What should we do, if we want to print with double quotes like this : String main "1 2 3"   
 */
