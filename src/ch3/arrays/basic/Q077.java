package ch3.arrays.basic;
// maybe in ch2.for_loop
public class Q077 {
	public static void main(String[] args) {
		int[] intArr = {8, 16, 64, 128};
		
	}
}

/* 77. Given this array:
 Which two code fragments, independently, print each element in this array? (Choose two.)

A. 		>> for-each, i is an element, not an index
  for (int i : intArr){
  	System.out.println(intArr[i] +" ");
  }

B.		>> OK
   for (int i : intArr){
	 System.out.println(i +" ");
   }

C.	>> for-each structure, initialization
   for (int i = 0 : intArr){
   	System.out.println(intArr[i] +" ");
    i++;
   }

D.	>> for-loop, i is an index, not an element
   for(int i = 0; i < intArr.length; i++) {
   	System.out.println(i + " ");
   }

E.	>> OK, for-loop, i is an index and used as index
	for(int i = 0; i < intArr.length; i++) {
   		System.out.println(intArr[i] + " ");
	}

F.	>> for-loop structure, initialization
	for(int i ; i < intArr.length; i++) {
		System.out.println(intArr[i] + " ");
	}

    A. Option A
    B. Option B		>> OK
    C. Option C
    D. Option D
    E. Option E		>> OK
    F. Option F

 */

