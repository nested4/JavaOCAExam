package ch2.for_loop;

public class B_Q111 {
    public static void main(String[] args) {
        int ii=0;
        int jj=7;
        for(ii=0; ii<jj-1; ii=ii+2){
            System.out.println(ii+" ");
        }
    }
}
/*111. What is the result?  (same Q075)
A. 2 4
B. 0 2 4 6
C. 0 2 4		>> ii<6
D. Compilation fails

 */
