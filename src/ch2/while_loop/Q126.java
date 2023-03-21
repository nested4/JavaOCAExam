package ch2.while_loop;

public class Q126 {

	public static void main(String[] args) {
		int array [] = {10, 20, 30, 40, 50};
		int x = array.length;
		/* line n1 */


	}
}

/* 126. Which two code fragments can be independently inserted at line n1 to enable the code 
  to print the elements of the array in reverse order? (Choose two.)

A. >> OK, index starts with length so need decrement for reverse order
	
	while (x>0) {
		x--;  
		System.out.print(array[x]);
	}

B. >> ArrayIndexOutOfBoundsException, (0>=0) loop dosen't end, then x is -1 
	do {
		x--;
		System.out.print(array[x]);		            
	}while (x>=0); 


C. >> ArrayIndexOutOfBoundsException, !! int x = array.length; x=5
	while (x>=0) {    
		System.out.print(array[x]); 
		x--;
	}

D. >> ArrayIndexOutOfBoundsException, !! int x = array.length; x=5
	do {
		System.out.print(array[x]);
		--x;                   
	}while (x>=0);
	
E.  >> OK, index starts with length so need decrement for reverse order
	while (x>0) {
		System.out.print(array[--x]);
	}
	
	??? what is the result?
	while (x>0) {
		System.out.print(array[x--]);
	}
	
*/