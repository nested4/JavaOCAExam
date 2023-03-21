package ch3.arrays.break_con;

public class Q037 {

	public static void main(String[] args) {
		int data [] = {2010, 2013, 2014, 2015, 2014};
		int key = 2014;
		int count = 0;
		for (int e : data) {
			if (e !=key) {
				continue; 
				count++; 			// cannot come after continue
			}
		}
		System.out.println(count + " Found");
	}

}
/*
37. What is the result?
A.	Compilation fails.     >> OK
B.	0 Found
C.	1 Found
D.	3 Found
*/

