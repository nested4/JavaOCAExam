package ch5.inheritance.Q170_202;

/**
public class Employee{
	public int salary;

}
public class Manager extends Employee{
	public int budget;

}
public class Director extends Manager{
	public int stockOptions;


}*/
public class Q170 {
	
	public static void main (String []args) {
		Employee employee=new Employee();
		Manager manager=new Manager();
		Director Director  =new Director();
	
		
 //line n1
	}

}

/*Which two options fail to compile when placed at line n1 of the main method? (Choose two.) (same 202:compile)
A. employee.salary = 50_000;
B. director.salary = 80_000;
C. employee.budget = 200_000;				>>
D. manager.budget = 1_000_000; 
E. manager.stockOption = 500;				>>
F. director.stockOptions = 1_000;

*/

/** FIGURE 5.1 Types of inheritance, p.235
 FIGURE 5.2 Defining and extending a class
 1-Java supports single inheritance, by which a class may inherit from only one direct parent class. 
 2-Java also supports multiple levels of inheritance, by which one class may extend another class, which in turn extends another class. 
 	You can extend a class any number of times, allowing each descendent to gain access to its ancestor’s members.
 3-
 
 this(), super(), p.239
 !!Like the this() command that you saw in Chapter 4, the super() command may only be used as the first statement of the constructor. For example, the following two class defi- nitions will not compile:
Constructor Definition Rules: p.242
! In Java, the parent constructor is always executed before the child constructor.
! Just remember to “think like the compiler” as much as possible and insert the missing constructors or statements as needed.

super vs super()
As discussed in Chapter 4, this() and this are unrelated in Java. Likewise, super() and super are quite different 
	but may be used in the same methods on the exam. 
The first, super(), is a statement that explicitly calls a parent constructor and 
	may only be used in the first line of a constructor of a child class. 
The second, super, is a keyword used to reference a member defined in a parent class and may be used throughout the child class.
 *
 */
