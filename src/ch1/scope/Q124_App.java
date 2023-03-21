package ch1.scope;

public class Q124_App { //public class App
	
	String myStr = "7007";
	
	public void doStuff(String str) {
		int myNum = 0;
	try {
		String myStr = str;
		myNum = Integer.parseInt(myStr);
	}catch (NumberFormatException ne) {
		System.err.println("Error");
	}
    System.out.println("myStr: " + myStr + ", myNum: "+myNum);
    
	}
	public static void main(String[] args) {
		Q124_App obj = new Q124_App();
		obj.doStuff("9009");
	}
}



/* 124. What is the result?		 (same 123)
A. myStr: 9009, myNum: 9009 
B. myStr: 7007, myNum: 7007 
C. myStr: 7007, myNum: 9009 	>> OK
D. Compilation fails
*/
