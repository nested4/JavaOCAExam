package ch3.A_string;

public class Q118_App {
    public static void main(String[] args) {
        String str1="Java";
        String str2=new String("java");
        //line n1

        {   
            System.out.println("Equal");
        }
        {
            System.out.println("Not Equal");
        }
    }
}
/*Which code fragment,when inserted at line n1,enables the App class to print Equal? (Exactly same Q218)
A) str1.toLowerCase();
    if(str1==str2)

B) if(str2.equals(str1.toLowerCase()))

C) str1.toLowerCase();
    if(str1.equals(str1.toLowerCase()))

D) if(str1.toLowerCase()== str2.toLowerCase())

A. Option A
B. Option B				 >> OK
C. Option C
D. Option D

 */
/** NOTES
 1. '==' -> object or value
 
 2. run for option D:
  String a=str1.toLowerCase();
  String b=str2.toLowerCase();
 */ 
