package ch3.arrays.basic;

public class Q164 {

	public static void main(String[] args) {
		int [] intArr= {15,30,45,60,75};
		intArr[2]=intArr[4];
		intArr[4]=90;
		

	}
}

/* 164. What are the values of each element in intArr after this code has executed? 
A. 15, 60, 45, 90, 75
B. 15, 90, 45, 90, 75
C. 15, 30, 75, 60, 90 			>>OK
D. 15, 30, 90, 60, 90 
E. 15, 4, 45, 60, 90

*/


//for (int i : intArr) {
//System.out.print(i+",");
//}
