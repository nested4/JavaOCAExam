package ch3.arrays.basic;

public class Q101 {
	public static void main(String[] args) {
        int numbers[];
        numbers=new int[2];
        numbers [0]=10;
        numbers [1]=20;

        numbers=new int[4];
        numbers [2]=30; 
        numbers [3]=40;
        for (int x:numbers){
            System.out.print(" "+x);
        }

}
}
/*
101. What is the result?
A. 10 20 30 40
B. 0 0 30 40				>> OK
C. Compilation fails.
D. An exception is thrown at runtime.

*/
/** NOTES
!! attention to 
1. new declaration
2. initial value of an integer array

*/