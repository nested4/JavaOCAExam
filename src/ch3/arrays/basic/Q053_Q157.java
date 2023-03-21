package ch3.arrays.basic;

public class Q053_Q157 {

	public static void main(String[] args) {
		int num [] [] = new int [1] [3];
		
 
		for (int i = 0; i < num.length; i++) {  			// num.length = 1
			for (int j = 0; j < num[i].length; j++) {  		// num[i].length =3
				num [i][j]= 10;  
				//System.out.println("num["+i+"]["+j+"]="+num [i][j]);
			}
		}
	}
}

/*
53. Which option represents the state of the num array after successful completion of the outer loop?

A. num [0] [0] = 10;
	num [0] [1] = 10;
	num [0] [2] = 10;

B. num [0] [0] = 10;  			>> new int [3] [1]
	num [1] [0] = 10;
	num [2] [0] = 10;

C. num [0] [0] = 10;
	num [0] [1] = 0;
	num [0] [2] = 0;

D. num [0] [0] = 10;			>> new int[2][4]
	num [0] [1] = 10;
	num [0] [2] = 10;
	num [0] [3] = 10;
	num [1] [0] = 0;
	num [1] [1] = 0;
	num [1] [2] = 0;
	num [1] [3] = 0;

A. Option A  >> //int num3 [] [] = {{10,10,10}};
B. Option B 
C. Option C 
D. Option D 
Answer: A
 */