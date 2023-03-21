package ch3.A_string;

public class Q130 {

	public static void main(String[] args) {
		System.out.println("5 + 2 = " + 3 + 4);
		System.out.println("5 + 2 = " + (3 + 4)); 
	}
}

/*
130. What is the result?
A.
	5 + 2 = 34
	5 + 2 = 34
B.
	5 + 2 + 3 + 4
	5 + 2 = 7

C.
	7 = 7
	7 + 7
D.
	5 + 2 = 34			>> left to right, "..." + 3, string concatenation
    5 + 2 = 7			>> with parenthesis both operand are numeric, adding operation

 A. Option A 
 B. Option B 
 C. Option C 
 D. Option D 			>> OK

 */ 


