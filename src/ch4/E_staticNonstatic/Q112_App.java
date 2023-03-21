package ch4.E_staticNonstatic;

public class Q112_App {
    int count;
    public static void displayMsg(){
        count++;                                         //line1
        System.out.println("Welcome"+"Visit Count"+count); //line2
    }

    public static void main(String[] args) {
    	Q112_App.displayMsg();           //line3
    	Q112_App.displayMsg();           //line4
    }
}
/*What is the result?  (same 139)
A. Compilation fails at line n3 and line n4.
 B. Compilation fails at line n1 and line n2.		>> OK
 C. Welcome Visit Count:1Welcome Visit Count: 1
  D. Welcome Visit Count:1Welcome Visit Count: 2
  Answer:B  ?

 */
/**NOTES
accessing in static to non-static
*/