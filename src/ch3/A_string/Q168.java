package ch3.A_string;

public class Q168 {

	public static void main(String[] args) {
		String names []= {"Thomas","Peter","Joseph"};
		String pwd[] =new String [3];
		int idx=0;
		try {
			for (String n:names) {
				pwd[idx]=n.substring(2,6);
				idx++;
			}
		}
		catch (Exception e) {
			System.out.println("Invalid name");
			
		}
		for (String p:pwd) {
			System.out.println(p);
		}
	}
}

/* 168. Given the code fragment:  (same 141)
What is result?

A
Invalid Name

B
Invalid Name
omas

C
Invalid Name
omas
null
null

D
omas
ter
seph

A.	Option A
B.	Option B
C.	Option C			>> OK
D.	Option D
*/

/** NOTES
?? difference from 141, printing place
 */

