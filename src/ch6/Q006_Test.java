package ch6;
import java.io.IOException;

class X{
	public void printFileContent() {					//line 5
		/*code goes here */
		throw new IOException();						// line 7
	}
}
public class Q006_Test {
	public static void main(String[] args)   {
		X xobj = new X();
		xobj.printFileContent();    // line 13
		
	}								//line 14
}

/* Which two modifications should you make so that the code compiles successfully? (Choose two.)
  A. >>	why NOT?
  	Replace line 13 with:
  	try {
			xobj.printFileContent();
	} 
	catch (Exception e) { }
	catch (IOException e) { }

  B. Replace line 7 with throw new IOException("Exception raised");
  C. public static void main(String[] args)  throws Exception					>>OK
  D. At line 14, insert throw new IOException();
  E. Replace line 5 with public void printFileContent() throws IOException		>>OK
  
 */

/** NOTES
FIGURE 6 .1 Categories of exception, p302
Error means something went so horribly wrong that your program should not attempt to
recover from it. For example, the disk drive “disappeared.” These are abnormal conditions
that you aren’t likely to encounter.

Error: not recoverable
Exception and also RuntimeException : recoverable
 
Unchecked: RuntimeExceptions are NOT checked by compiler in compile time
Checked: Exceptions are checked by compiler in compile time.
Checked exceptions tend to be more anticipated—for example, trying to read a file that doesn’t exist.
For checked exceptions, Java requires the code to either handle them or declare them in the method signature.

!!!! throw vs throws
throw tells Java that you want to
throw an Exception. throws simply declares that the method might throw an Exception

FIGURE 6 . 2 The syntax of a try statement, p.305
FIGURE 6 . 3 The syntax of a try statement with finally, p.307
Catching Various Types of Exceptions,p309
* MULTIPLE CATCH: more specific Exception (subclass) must be catch first, then less specific (superclass)

Recognizing Common Exception Types,p314

 !! for this question:

if there is "throw new Exception();", 
step 1-it should be handled by adding "throws" in the method signature
step 2- in any other method which called this method, there are two options.
 
 !! if a method throws an Exception,  it should be handled wherever it is called
 To Handle two options:
 1- Surround the calling statement with try/catch
 2- Add throws declaration  into  method signature that calls another method which throws an Exception


 */
 
