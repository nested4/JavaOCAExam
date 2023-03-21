package ch4.E_staticNonstatic;

 class Q032 {  // class X
	int i;
	static int j;
	public static void main(String[] args) {
		Q032 x1 = new Q032();
		Q032 x2 = new Q032();
		x1.i = 3;
		x1.j = 4;
		x2.i = 5;
		x2.j = 6;
		System.out.println(
				x1.i + " " +
				x1.j + " " + 
				x2.i + " " + 
				x2.j);
	}
}
 /*What is the result?  (same 7)
		 A.	3 4 5 6
		 B.	3 4 3 6
		 C.	5 4 5 6
		 D.	3 6 5 6		>>OK
*/