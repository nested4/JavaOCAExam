package ch6;
class LogFileException extends Exception{}
class AccessViolationException extends RuntimeException{}
public class Q215_App {
	public static void main(String[] args) throws  LogFileException{		//line2
		Q215_App obj=new Q215_App();
		try {
			obj.open();
			obj.process();
			//insert code here              //line 7
			throw new LogFileException();
		}catch (Exception e){
			System.out.println("completed.");
		}
	}
	public void  process() {				// line 13
		System.out.println("Processed");
		throw new LogFileException();
	}
	public void open(){						//line 17
		System.out.println("Opened.");
		throw new AccessViolationException();
	}
}

/*Which action fixes the compiler error?
A. At line 17, add throws AccessViolationException										>> AccessViolationException is a RuntimeException (unchecked)
B. At line 13, add throws LogFileException												>> OK, LogFileException is an Exception (checked)
C. At line 2, replace throws LogFileException with throws AccessViolationException		>> need to add an  Exception (checked)
D. At line 7, insert throw new LogFileException ();										>> no affect, there is already throws in method signature

*/
