package ch3.A_string;

public class Q011 {
	public static void main(String[] args) {
		String[] strs = {"A", "B"};
		int idx = 0;
		for (String s : strs) {
			strs[idx].concat(" element " + idx);
			idx++;		
		}	
		for (idx = 0; idx < strs.length; idx++) {
			System.out.println(strs[idx]);
		}
	}
}
/*
11. What is the result?   (same Q146)
A.	A					>> OK
	B
B.	A element 0
	B element 1
C.	A NullPointerException is thrown at runtime.
D.	A 0
	B 1
 */




/** NOTES
Immutability, p.104 
-Mutable is another word for changeable. 
-Immutable is the opposite—an object that can’t be changed once it’s created. 
On the OCA exam, you need to know that String is immutable.
So any String method DOESN'T AFFECT its OWN object.

strs[idx]=strs[idx].concat(" element " + idx);
	A element 0
	B element 1
***/