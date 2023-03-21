package ch6;

class MyException extends RuntimeException {}
public class Q085 {
	public static void main(String[] args) {

		try {
			method1();
		}
		catch (MyException ne) {
			System.out.print("A");
		}
	}

	public static void method1() {		// line n1
		try {
			throw Math.random() > 0.5 ? new MyException() : new RuntimeException();
		}
		catch (RuntimeException re) {
			System.out.print("B");
		}
	}

}

/*What is the result?
A. A												>> When?
B. B												>> OK
C. Either A or B
D. A B
E. A compile time error occurs at line n1			>> When?
 */

/**
What are the differences between 68 and 85
no need to handle RuntimeException

 */




