package ch6;

public class Q171 {

}
/*
 * 
 171. Which three statements are true about exception handling? (Choose three.) 
A. Only unchecked exceptions can be rethrown.
B. All subclasses of the RuntimeException class are not recoverable.
C. The parameter in a catch block is of Throwable type.											>>OK 
D. All subclasses of the RuntimeException class must be caught or declared to be thrown. 		
E. All subclasses of the RuntimeException class are unchecked exceptions.						>>OK, Compiler dosen't check it
F. All subclasses of the Error class are not recoverable. 										>>OK


 */

/** FIGURE 6 .1 Categories of exception, p302
Error means something went so horribly wrong that your program should not attempt to
recover from it. For example, the disk drive “disappeared.” These are abnormal conditions
that you aren’t likely to encounter.

Error: not recoverable
Exception and also RuntimeException : recoverable
 
Unchecked: RuntimeExceptions are NOT checked by compiler in compile time
Checked: Exceptions are checked by compiler in compile time.
*/
