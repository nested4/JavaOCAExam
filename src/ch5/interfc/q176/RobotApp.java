package ch5.interfc.q176;

interface  Speakable {
	public void speak(String s);
}

abstract class Robot implements Speakable {
	public void process();
}
class Humanoid extends Robot {
	public void speak (String s) { System.out.println(s); }
	public void process () { System.out.println("Helping... "); }
}

public class RobotApp {

	public static void main(String[] args) {
	
		Robot r = new Humanoid();
		r.process();
		r.speak("Done");
	
	}

}
/*
 * Which action enables the code to print Helping.. Done?
A.  >> it means make it abstract, but what about new Humanoid(); ? Abstracts cannot be instantiated directly.
	
	replace class Humanoid extends Robot {
	with abstract class Humanoid extends Robot {

B. >> make it abstract, in this case what is wrong? Non-abstract method speak requires a body
	
	replace interface Speakable { 
	with abstract class Speakable {
	

C. >> OK

	replace public void process();
	with public abstract void process();

D. >> in this case what is wrong?  it means make it concrete class which has to implements all abstract methods
	
	replace abstract class Robot implements Speakable { 
	with class Robot extends Speakable {

*/
/** 
!! Check if there is any unimplemented method
!! Attention to Abstract without body, non-abstract with body
!! Attention to overriding rules
 */
