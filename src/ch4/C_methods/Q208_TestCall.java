package ch4.C_methods;

class Caller_Q208 {
    private  void init(){
        System.out.println("Initialized");
    }
    private void  start(){
        init();
        System.out.println("Started");
    }
}
public  class Q208_TestCall{
    public static void main(String[] args) {
    	Caller_Q208 c=new Caller_Q208();
        c.start(); //line 1
        c.init(); //line 2
    }
}
/*
What is the result? (same 67)
A. Compilation fails at line n1.
B. InitializedStartedInitialized
C. InitializedStarted
D. Compilation fails at line n2.

Answer: A and D   
 */

/** Attention to access modifier (public, private,protected)
 private: The method can only be called from within the same class.
 !! The method init() from the type Caller_Q208 is not visible
 */
