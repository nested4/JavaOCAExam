package ch2.while_loop;

public class Q223 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int i=0;				
        do {
            System.out.print(arr[i] + " ");
            i++;
        }while(i<arr.length+1);
    }
}
/*What is the result?
A. 1 2 3 4followed by an ArrayIndexOutOfBoundsException  >> OK
B. 1 2 3
C. 1 2 3 4
D. Compilation fails.
 
 */
/** NOTES
!!! pay attention to loop termination condition
1: array length and last index
	last index = length - 1
*/