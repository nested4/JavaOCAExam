package ch4.F_constructor;

public class Q119_App {  // public class App

	String greet="Welcome!";
	public Q119_App(){
		String greet="Hello!";
	}
	public void setGreet(){
		String greet="Good Day!";
		this.greet=greet;
	}

	public static void main(String[] args) {
		Q119_App t=new Q119_App();
		String greet="Good Luck!";
		System.out.println(t.greet);
	}
}
/*What is the result?
A. Good Luck!
B. Good Day!
C. Welcome!				>>OK
D. Hello!

 */

/** NOTES

 Order of Initialization, p.202

 variable scope: Local and global variable with the same name
 	t.greet  >> get instance variable of object

 what is the result in this case:

 String greet="Welcome!";
	{System.out.println(greet);}

 or 
 String greet="Welcome!";
	{System.out.println(greet);}
    public Q119_App(){
         this.greet="Hello!";
    }

 */ 
