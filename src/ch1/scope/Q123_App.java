package ch1.scope;

public class Q123_App {	//public class App

	String myStr = "9009";

	public void doStuff(String str) {
		int myNum=0;

		try {

			String myStr = str;
			myNum = Integer.parseInt(myStr);
		}catch (NumberFormatException ne) {
			System.err.println("Error");
		}
		System.out.println("myStr: " + myStr + ", myNum: "+myNum);

	}
	public static void main(String[] args) {
		Q123_App obj = new Q123_App();
		obj.doStuff("7007");

	}
}



/* 123. What is the result?		 (same 124)
A. myStr: 7007, myNum: 7007 
B. Error
C. myStr: 9009, myNum: 7007 		>> OK
D. myStr: 7007, myNum: 9009			
 */
