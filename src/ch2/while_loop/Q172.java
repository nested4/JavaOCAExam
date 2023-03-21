package ch2.while_loop;

public class Q172 {

	public static void main(String[] args) {

		int num = 5;
		do {    
			System.out.print(num-- +" ");  
		}while (num == 0); 
	}
}

/*
172. What is the result? 
A. 5 4 3 2 1 0
B. 5 4 3 2 1
C. 4 2 1
D. 5				>>OK
E. Nothing is printed

 */

/** NOTES
 !! pay attention to the condition
 What is the result under these conditions:
 1: while (num != 0);  
 2: System.out.print(--num +" ");
 ****/
