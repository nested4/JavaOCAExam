package ch2.while_loop;

public class Q004 {

	public static void main(String[] args) {
		int[] stack = {10, 20, 30};
		int size =3;
		int idx = 0;	
		/* line n1 */
		System.out.print("The top element: " + stack[idx]);	
	}
}

/* 4. Which code fragment, inserted at line n1, prints The Top element: 30?
 
A. >> The top element: 20
   do {							
		idx++;							// idx = 1   
	}while(idx >= size);				// (1>=3) is false loop ends		 

B. 		>> ArrayIndexOutOfBoundsException
	while(idx < size){					// (3<3) is false loop ends	
			idx++;						// idx =3  
	}

C. 	>> OK >> The top element: 30
	do {							
		idx++;							// idx = 2 
	}while(idx < size-1);				// (2<2) is false loop ends
	
D.  >> ArrayIndexOutOfBoundsException	
	do {							
			idx++;						// idx =4
	}while(idx <= size);				// (4 <= 3) is false loop ends	
																													
E. 	>> ArrayIndexOutOfBoundsException
	while(idx <= size -1){				// (3 <= 2) is false loop ends
			idx++;						// idx =3  	 		
    }

 */

/** NOTES
 The while Statement and do-while Statement: p.76-78
 FIGURE 2.5 The structure of a while statement
 FIGURE 2.6 The structure of a do-while statement
 */


