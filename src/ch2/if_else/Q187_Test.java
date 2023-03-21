package ch2.if_else;

public class Q187_Test{  //public class Test
	
    public static void main(String[] args) {
        if (args[0].equals("Hello") ? true : false){
            System.out.println("Success");
        }else {
            System.out.println("Failure");
        }
    }
}
/*
And given the commands :
 	javac Test.java
 	Java Test Hello

What is the result?
A. Success				>> args[0] == Hello >> OK
B. Failure
C. Compilation fails.
D. An exception is thrown at runtime

*/

/******* Notes
1: conditional operator or Ternary Operator : p.71
	It is represented by two symbols: '?' and ':'
	It takes three operands and is of the form:
		booleanExpression ? expression1 : expression2
	equal : if-then-else statement
2. String.equals()  -> content equality
Compares this string to the specified object. The result is true if and only if the argument is not null 
and is a String object that represents the same sequence of characters as this object.
*******/


