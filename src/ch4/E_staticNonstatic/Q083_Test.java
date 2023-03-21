package ch4.E_staticNonstatic;

public class Q083_Test {
	public static void main(String[] args) {

		Q083_Test ts = new Q083_Test();
		System.out.println(isAvailable);
		isAvailable = ts.doStuff();
		System.out.println(isAvailable);
	}
	public static boolean doStuff() {
		return !isAvailable;
	}
	static boolean isAvailable = true;
}
/*
What is the result?   (same 72)
A. Compilation fails.
B. false true
C. true false			>>OK
D. true true
E. false false
*/




