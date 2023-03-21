package ch5.interfc.q051;
//public abstract interface Exportable{ // assumed
interface Exportable{
	//public abstract void export(); //assumed
	 void export();
}
class Tool implements Exportable{
	protected void export() {						// line n1   Cannot reduce the visibility of the inherited method from Exportable
		System.out.println("Tool::export");
	}
}
 class ReportTool extends Tool implements Exportable {
	public void export() {							// line n2
		System.out.println("RTool::export");
	}
	public static void main(String[] args) {
		Tool aTool = new ReportTool();
		Tool bTool = new Tool();
		callExport(aTool);
		callExport(bTool);
	}
	public static void callExport(Exportable ex) {
		ex.export();
	}
	
}
/* What is the result?  (same 63)
A.	Compilation fails only at line n2.
B.	RTool::exportTool::export				>> OK after correction. Why?
C.	Tool::exportTool:export					>> Why not?
D.	Compilation fails only at line n1.		>>OK	Remember: Assumption rule 2 for the method: public abstract
E.	Compilation fails at both line n1 and line n2.
*/
 
 /**  For this question attention to overriding and assumption rule for a method
 Rule 2. The method in the child class must be at least as accessible or more accessible than the method in the parent class.
 TABLE 4.2 Access modifiers, p.180
  private (in class) < default (in package) < protected (in package or subclasses)< public  (any)
 
 
 If it can be compiled, what is the result?
 What is type of reference and object?

 
!!  GENERAL Information for Interface
 Implementing Interfaces, p.266
 -FIGURE 5.4 Defining an interface
 Attention to assumptions for access and special modifiers: 
 1- for a class:         		[public | default] abstract keyword (assumed)  (Rule 4)
 2- for a nondefault method:    public abstract keywords (assumed)			  (Rule 5 )
 	nondefault means abstract and no body
 3- for a variable:  	 		public static final keywords (assumed)

Rules:
1. Interfaces cannot be instantiated directly.  		 (identical to abstract rule)
2. An interface is not required to have any methods.	 (identical to abstract rule)
3. An interface may not be marked as final.				 (identical to abstract rule)
4. All top-level interfaces are assumed to have PUBLIC or DEFAULT access, and they must include 
  the abstract modifier in their definition. 
  Therefore, marking an interface as private, protected, or final will trigger a compiler error, 
  since this is incompatible with these assumptions.
5. All nondefault methods in an interface are assumed to have the modifiers abstract and public in their definition. 
	Therefore, marking a method as private, protected, or final will trigger compiler errors as these are incompatible 
	with the abstract and public keywords.
 
 
* Inheriting an Interface, p.269
There are two inheritance rules you should keep in mind when extending an interface:
1. An interface that extends another interface, as well as an abstract class that implements an interface, 
	inherits all of the abstract methods as its own abstract methods.
2. The first concrete class that implements an interface, or extends an abstract class that implements an interface, 
	must provide an implementation for all of the inherited abstract methods.
	!! implementation means a method with BODY
 
* Two interface variables rules:, p.273
1. Interface variables are assumed to be public, static, and final. Therefore, marking a variable 
	as private or protected will trigger a compiler error, as will marking any variable as abstract.
2. The value of an interface variable MUST BE SET when it is declared since it is marked as FINAL.
 
* Default Interface Methods, p.274  !!! With the release of Java 8,
A default method is a method defined within an interface with the default keyword in which a method body is provided.
!!! default --> needs body
!!! nondefault (abstract) --> no body

1. A default method may only be declared within an interface and not within a class or abstract class.
2. A default method must be marked with the default keyword. If a method is marked as default, 
	it must provide a method body.
3. A default method is not assumed to be static, final, or abstract, as it may be used or overridden 
	by a class that implements the interface.
4. Like all methods in an interface, a default method is assumed to be public and will not compile 
	if marked as private or protected.

* Static Interface Methods, p278. !!! With the release of Java 8
Rules:
1. Like all methods in an interface, a static method is assumed to be public and will not compile 
	if marked as private or protected.
2. To reference the static method, a reference to the name of the interface must be used.

A static method defined in an interface is not inherited in any classes that implement the interface.
Therefore,it can be accessed without an instance of the class, 
	but also needs explicit reference to the name of the interface class

*/
