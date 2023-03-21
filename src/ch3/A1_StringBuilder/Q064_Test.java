package ch3.A1_StringBuilder;
//OR Maybe in ch3.toString

//MyString.Java:
//package p1;
class MyString {
    String msg;
    MyString(String msg){
        this.msg =msg;

    }
}
//Test.java:
//package p1;
public class Q064_Test {
    public static void main(String[] args) {
    	
        System.out.println("Hello "+ new StringBuilder("Java SE 8"));
        System.out.println("Hello "+ new MyString("Java SE 8").msg);
    }
}

/* 64. Given the definitions of the MyString class and the Test class: (same 174)
 
  What is the result?
A
    Hello Java SE 8
    Hello Java SE 8

B
    Hello java.lang.StringBuilder@<<hashcode1>>
    Hello packageName.MyString@<<hashcode2>>

C
    Hello Java SE 8
    Hello packageName.MyString@<<hashcode>>

D
    Compilation fails at the Test class

    A. Option A
    B. Option B
    C. Option C				>> OK
    D. Option D
*/

/** NOTES
 System.out.println("Hello "+ new MyString("Java SE 8").msg); 
*/