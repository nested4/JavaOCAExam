package ch4.C_methods;

public class Q067 {

}
class Caller {
	private void init() {
		System.out.println("Initialized"); 
	}

	private void start() {
		init();
		System.out.println("Started");
	}
}

class TestCall {
	public static void main(String[] args) {
		Caller c = new Caller();
		c.start();
		c.init();
	}
}

/*What is the result? (same 208)
A. An exception is thrown at runtime.
B. InitializedStartedInitialized
C. InitializedStarted
D. Compilation fails.				>>OK
*/

/** NOTES
 * Access Modifiers, p.173
Java offers four choices of access modifier:
1-public: The method can be called from any class.
2-private The method can only be called from within the same class.
3-protected The method can only be called from classes in the same package or subclasses. 
	You’ll learn about subclasses in Chapter 5.
4-Default (Package Private) Access the method can only be called from classes in the same package. 
	This one is tricky because there is no keyword for default access. You simply omit the access modifier.
 
 * TABLE 4.2 Access modifiers, p.180
 private (in class) < default (package private-in package) < protected (in package or subclasses)< public  (any)
 
 !!Encapsulation 
 Java supports access modifiers to protect data from unintended access and modification. 
 
 
 Attention to access modifier (public, private,protected)
 Change visibility of 'start()' to 'package' >> void start(){}
 */
