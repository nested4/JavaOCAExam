package ch4.F_constructor;

class Employee {

	private String name;
	private int age;
	private int salary;

	public Employee (String name,int age) {
		setName (name);
		setAge (age);
		setSalary (2000);
	}

	public Employee (String name,int age,int salary) {
		setSalary (salary);
		this(name,age);   

	}

	//getter and setter methods for attributes go here
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}

	public void printDetails () {
		System.out.println(name +" : "+age+" : "+salary);
	}
}

class Q099_Test {

	public static void main(String[] args) {
		Employee e1 = new Employee(); 
		Employee e2 = new Employee("Jack",50);
		Employee e3 = new Employee("Chloe",40,5000);

		e1.printDetails();
		e2.printDetails();
		e3.printDetails();

	}
}

/* Which is the result? !!! Look at question file   (same 147)

A) Compilation fails in the Employee class

B) null : 0 : 0
	Jack : 50 : 0
	Chole : 40 : 5000

C) null : 0 : 0														>> if it can be compiled 
	Jack : 50 : 2000
	Chole : 40 : 5000

D) Compilation fails in the Test class

E) Both the Employee class and the Test class fail to compile 			>> OK, Why?

*/
/** NOTES
 * Overloaded constructors often call each other, but constructor call must be the first statement in a constructor
 * in  Employee class, calling order, this ()
 * in Test class, calling default constructor/ without parameter, but it is not exist 	
  	the constructor Employee() is undefined

!!! A good example for encapsulation, private variable and getter-setter
 */

