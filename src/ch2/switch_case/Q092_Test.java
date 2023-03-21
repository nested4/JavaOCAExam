package ch2.switch_case;

public class Q092_Test {


    public static void main(String[] args) {
        //line n1
        switch (x) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
        }
    }
}

/* 92. Which three code fragments can be independently inserted at line n1 to enable the code to print One?
 * (Choose three.)
A. byte x = 1;					>> OK
B. short x = 1;					>> OK
C. String x = "1";				>> String is supported, but not the SAME DATA TYPE as the switch value
D. long x = 1;					>> not long
E. double x = 1;				>> not double
F. Integer x = new Integer("1");>> OK
Answer: ABF
*  */

/*** NOTES
Cannot switch on a value of type boolean. And long, double, float 
cibsse=== char int byte short string enum

Compile-time Constant Values, p.73
	The values in each case statement must be compile-time constant values 
	of the SAME DATA TYPE as the switch value
*/


