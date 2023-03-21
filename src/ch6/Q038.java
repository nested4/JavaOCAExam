package ch6;

public class Q038 {

}
/*
 * 38. Which three are advantages of the Java exception mechanism? (Choose three.)
A. Improves the program structure because the error handling code is separated from the normal program function			>>OK
B. Provides a set of standard exceptions that covers all possible errors												>> error are not recoverable
C. Improves the program structure because the programmer can choose where to handle exceptions							>> OK, two options to handle
D. Improves the program structure because exceptions must be handled in the method in which they occurred				>> conflicts with C
E. Allows the creation of new exceptions that are customized to the particular program being created					>> OK
Answer: A C E
 */


/**
C or D: because of this C is correct
!! if a method throws an Exception,  it should be handled wherever it is called
To Handle two options:
1- Surround the calling statement with try/catch
2- Add throws declaration  into  method signature that calls another method which throws an Exception
*/

