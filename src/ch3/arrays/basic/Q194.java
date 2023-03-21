package ch3.arrays.basic;

public class Q194 {
    public static void main(String[] args) {
//line 3  /* insert code here  */  
    
        array [0]= 10;
        array [1]= 20;
        System.out.println(array[0] + " : " + array[1] );
    }
}

/* Which code fragment, when inserted at line 3, enables the code to print 10:20?

A.  >> need 2 slots, not 1
	int [] array = new int [1];

B.  >> OK, define then create
	int [] array;			
    array = new int [2];

C.  >> left side, there is no array
	int array = new int [2];

D.  >> wrong usage, at left side dosen't allow dimension definition.
	int array [1];

*/