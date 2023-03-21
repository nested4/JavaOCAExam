package ch3.arrays.basic;

public class Q207 {
	public static void main(String[] args) {
		int[][] arr=new int[2][4];

		arr[0]=new int[]{1,3,5,7};
		arr[1]=new int[]{1,3};

		for (int[] a:arr){     
			for (int i = 0; i < arr.length; i++) {  
				System.out.println(a[i]+" ");
			}
			System.out.println();
		}
	}
	}
/*
    what is the result? (same 132)
    A. 1 3 5 71 3
    B. 1 3 1 3			>>OK
    C. 1 31 3 0 0
    D. 1 3followed by an ArrayIndexOutOfBoundsException
    E. Compilation
 */
/** NOTES
!!! attention to boolean expression of inner loop, limit of i
*/ 

