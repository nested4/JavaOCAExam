package ch2.operators;

public class Q002_App {

	public static void main(String[] args) {
		int i = 10;
		int j = 20;
		int k = (j +=i) / 5;      
		System.out.print(i + " : " + j + " : " + k);
	}
}


/*
What is the result? 
A. 10:30:6
B. 10 : 22 : 22
C. 10 : 22 : 20
D. 10:22:6

Answer: A
 */

/**** NOTES
  1: the order of operation by wrapping parentheses: p.54
  2: k = (j +=i) /5			=> first j= j+i =30, then j/5 =6
  3: k = j += i / 5 		=> first i / 5 = 2, then k = j = j + 2 => 22 
 *****/
