package ch4.C_methods;

public class Q040_Test {

	public static void main(String[] args) {
		int numbers[] = {12, 13, 42, 32, 15, 156, 23, 51, 12};
		int[] keys = findMax(numbers); 			

	}
	/*line n1 */
	static int[] findMax (int[] max)	{
		int[] keys = new int [3];  								
		/* code goes here */
		return keys; 														
	}
}

/*Which method signature do you use at line n1?
A.	public int findMax (int[] numbers)
B.	static int[] findMax (int[] max)			>> OK
C.	static int findMax (int[] numbers) 							 
D.	final int findMax (int[] )
 */

/**NOTES
 FIGURE 4.1 Method signature, p.166
Attention to method declaration
1. No object created to call the method, so method should be:     static____findMax();{
2. parameter of the method must be int array:    static____findMax(int [] numbers);{	
3. return type should be int array:    static int[] findMax (int [] numbers)	;{

the static main can call only a static method without object 
 */