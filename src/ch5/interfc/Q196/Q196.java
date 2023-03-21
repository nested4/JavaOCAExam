package ch5.interfc.Q196;

public class Q196 {
}
    /*
Given this segment of code:
ArrayList<Cycle> myList = new ArrayList<>();
myList.add(new MotorCycle()); 
    *
Which two statements, if either were true, would make the code compile? (Choose two.) 
A. MotorCycle is an interface that implements the Cycle class.			>> NO: MotorCycle is a concrete class
B. Cycle is an interface that is implemented by the MotorCycle class. 	>> OK: MotorCycle implements Cycle
C. Cycle is an abstract superclass of MotorCycle.						>> OK: MotorCycle extends Cycle
D. Cycle and MotorCycle both extend the Transportation superclass. 		>> NO: unrelated
E. Cycle and MotorCycle both implement the Transportation interface. 	>> NO: unrelated
F. MotorCycle is a superclass of Cycle.									>> NO: MotorCycle implements/extends Cycle

Answer: B C

*/

/**
 myList.add(new MotorCycle()); --> Cycle c1= new MotorCycle(); myList.add(c1)
 subclass to super, it is OK without casting, it is just limiting the access, masking
 */



