package ch2.switch_case;

public class Q155 {

	public static void main(String[] args) {
		int wd=0;
		String days[] = {"sun","mon","wed","sat"};
		for (String s:days) {
			switch (s) { 
			case"sat":
			case"sun":
				wd-=1;
				break;
			case "mon":
				wd++;
			case"wed":
				wd+=2;
			}
		}
		System.out.println(wd);
	}
}
/* 155. What is the result?
A. 3			>>OK
B. 4
C. -1
D. Compilation fails.

 */

/***NOTES
 break: optional, with and without break cause different results, p.74
 */
