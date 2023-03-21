package ch1.scope;

public class A_Q193 {

    public static void main(String[] args) {

    	int sum = 0;
        for (int xVal = 1; xVal <= 5; xVal++){
            sum = sum + xVal;
        }
//        System.out.println("The sum of "+xVal + " number is: " +sum);  
        

    }
   
}

/*
193. What is the result?
A. The sum of 4 numbers is: 10
B. A compile time error occurs.			>> xVal cannot be resolved to a variable
C. The sum of 5 numbers is: 10
D. The sum of 5 numbers is: 15
*/


/***** NOTES
Declaring and Initializing Variables, p.25
1: A variable is a name for a piece of memory that stores data. 
	String zooName;						>> declaration
	zooName = "The Best Zoo";			>> initialization
	String zooName = "The Best Zoo";	>> declaration and initialization

!! Before you can use a variable, it needs a value
!! using a reserved word as a variable name is not legal, Compilation fails, the list of reserved words, p.28

Variable Scope, p.31
1: Local variables—in scope from declaration to end of block 
	 The code between the braces '{}' is called a code block.
2: Instance variables—in scope from declaration until object garbage collected 
	An instance variable has similarities with a class variable, but is non-static
3: Class variables, has keyword static—in scope from declaration until program ends

!! Instance and class variables do not require you to initialize them. 
As soon as you declare these variables, they are given a default value. Table 1.2, p.31

!! When you see a set of braces ({ }) in the code, it means you have entered a new block of code. 
Each block of code has its own scope

run these cases:
case1: move the print into the loop
case2: move to xVal declaration outside of the loop
 	int xVal;
 	for ( xVal = 1; xVal <= 5; xVal++){
            sum = sum + xVal;
 *****/

