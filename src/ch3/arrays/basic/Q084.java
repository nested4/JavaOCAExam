package ch3.arrays.basic;

public class Q084 {
	public static void main(String[] args) {
		
		int array []={1, 2,3};  
		int array2[]=new int [] {1,2,3};
		int array3[] = new int[3]; array3[0] = 1; array3[1] = 2; array3[2] = 3;
		int array4[]= new int[3]; 
		int array5[]= {1,2,3};
		
		
		
		
	} 
	

}

/*84. Which two array initialization statements are valid? (Choose two.) 

A.	>> Cannot define dimension expressions when an array initializer is provided
	int array []=new int[3] {1, 2,3};            
	
B.	>> OK, create then assign
	int array[] = new int[3]; array[0] = 1; array[1] = 2;
	array[2] = 3;
	
C.	>> wrong usage, dimension definition must be at right side
	int array[3]=new int[] {1,2,3};			

D.	>> Array constants can only be used in initializers, correct usage is B
	int array[]= new int[3]; array= {1,2,3};
		array= new int [] {1,2,3};
	
E.	>> OK, create and initialize
	int array[]=new int [] {1,2,3};			
 
 */
