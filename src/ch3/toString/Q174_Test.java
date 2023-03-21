package ch3.toString ;
// Also in ch3.A1_StringBuilder

//MyString.Java:
//package p1;
class Q174_MyString{

	String msg;

	Q174_MyString(String msg) {
		this.msg = msg;
	}
}
//Test.java:
//package p1;
public class Q174_Test {

	public static void main(String[] args) {
		System.out.println("Hello " + new StringBuilder("Java SE 8"));
		System.out.println("Hello "+ new MyString("Java SE 8").msg);                 
	}   

}

/* 174. Given the definitions of the MyString class and the Test class: (same 64)

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

  A. Option A			>> OK
  B. Option B
  C. Option C				
  D. Option D
*/

/** NOTES
!! attention to printing the object or a field of object 
*/