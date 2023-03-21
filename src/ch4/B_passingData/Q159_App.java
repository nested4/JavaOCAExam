package ch4.B_passingData;

class Book {int pages;}
public class Q159_App{ // public class APP
	int count ;
	public void method (Book x,int k) {
		x.pages=100;
		k=200; 
	}

	public static void main(String[]args) {
		Q159_App obj =new Q159_App();
		Book objBook= new Book();

		System.out.println(objBook.pages+":"+obj.count);
		obj.method(objBook, obj.count);
		System.out.println(objBook.pages +":"+obj.count);


	}
}
/*159. What is the result?
	A. 0:0 100:0					>> OK
	B. null:0 100:0
	C. 0:0 100:200
	D. null:null 100:null
	
	*/


/** NOTES 
 * Passing Data p.188, pass by value
 * 
 * RUN in DEBUG MODE and Look at test_pass for wrappers
 * !!! passing an object means passing the copy of object reference, both has the same address value
 Objects vs. References, p.37, an object reference has name and object address value
 For further reading: https://stackoverflow.com/questions/40480/is-java-pass-by-reference-or-pass-by-value
 
 
 initialization of fields (Instance and Class variables) with default values
 */

