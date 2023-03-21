package ch2.operators;

public class Q163_Test {
public static void main (String []args) {
	int x=1;
	int y=0;
	if (x++ > ++y) {
		System.out.print("Hello ");
	} else {
		System.out.print("Welcome ");
		System.out.print("Log "+x+":"+y);
		
	}
}
}

/*
What is the result? 
A. Hello Log 1:0
B. Hello Log 2:1		
C. Welcome Log 2:1 		>> OK
D. Welcome Log 1:0 


*/
