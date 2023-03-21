package ch2.switch_case;

public class Q142 {

	
	public static void main(String[] args) {

		int wd = 0;
		String days[] = {"sun", "mon", "wed", "sat"};
		for (String s: days){
			switch (s){
			case "sat":
			case "sun":
				wd-=1;
				break;
			case "mon":
				wd-=1;
				break;
			case "wed":
				wd+=2;
			}
		}
		System.out.println(wd);
	}

}
/*  142. What is the result?
A. 3
B. 0
C. Compilation fails.
D. -1					>>OK

 */

/***NOTES
break: optional, with and without break cause different results, p.74
*/

