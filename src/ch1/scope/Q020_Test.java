package ch1.scope;

public class Q020_Test { //public class Q020_Test
	int a1;
	public static void doProduct(int a) {
		a = a * a;
	}
	public static void doString(String s) {
		s.concat(" " + s);
	}
	public static void main(String[] args) {
		Q020_Test item = new Q020_Test();
		item.a1 = 11;
		String sb = "Hello";
		Integer i = 10;
		doProduct(i);
		doString(sb);
		doProduct(item.a1);
		System.out.println(i+ " " + sb + " " + item.a1);
	}
}
/*What is the result?
A.	10 Hello Hello 11
B.	10 Hello Hello 121
C.	100 Hello 121
D.	100 Hello Hello 121
E.	10 Hello 11			>> OK

*/

/** NOTES
Tricky point is scope of variables. 

Actually the subject of the Ch1, but there are also complex issues.
After ch4, look again
-modify the code to print option C


public class Q020_Test { //public class Q020_Test
	int a1;
	public static int doProduct(int a) {
		a = a * a;
		return a;
	}
	public static void doString(String s) {
		s.concat(" " + s);
	}
	public static void main(String[] args) {
		Q020_Test item = new Q020_Test();
		item.a1 = 11;
		String sb = "Hello";
		Integer i = 10;
		i=doProduct(i);
		doString(sb);
		item.a1=doProduct(item.a1);
		System.out.println(i+ " " + sb + " " + item.a1);
		or
		System.out.println(doProduct(i)+ " " + sb + " " + doProduct(item.a1));
	}
}
**/