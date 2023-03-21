package ch5.abstrct;

public class Q134 {
	

	}
/*	134. Which two class definitions fail to compile?(choose two)

A 
		abstract class A3 {
			private static int i;
			public void doStuff() {}
			public A3() {}

B
		final class A1 {
			public A1() {
			}
		}

C  		>> We can not declare top level class as private. 
		Java allows only public and default modifier for top level classes in java. Inner classes can be private.

		private class A2 {
			private static int i;
			private A2() { }
		}

D
		class A4 {
	    protected static final int i =10 ;
	    private A4() { }
		}

E 		>> class can be final or abstract, not both of them
		
		final abstract class A5 {
	    protected static int i;
	    void doStuff() { }
	    abstract void doIt();
		}
*/

/** NOTES
!! first look at the topic inheritance

Creating Abstract Classes, p.259
Abstraction is a process of hiding the implementation details and showing only functionality to the user.

1-An abstract class is a class that is marked with the abstract keyword and cannot be instantiated 
	(don't use it with new keyword!!). 

2-An abstract method is a method marked with the abstract keyword defined in an abstract class, 
  for which no implementation is provided in the class in which it is declared.
  	(it means no method body !!!)

3-A concrete class is the first non-abstract subclass that extends an abstract class. 
 	Concrete class is REQUIRED (must) to implement all inherited abstract methods. 

4-not a final  (final means unchangeable, but an abstract must be override in child class)
  or private (not , but an abstract must be accessible for overriding) 

5- The final keyword in java is used to restrict the user to: 
	variable —> stop value change               
	method	 —> stop method overriding 
	class 	 -> stop inheritance 

6-Java allows only public and default modifier for top level classes in java. Inner classes can be private.

https://www.mobilhanem.com/java-abstraction/ 
*/