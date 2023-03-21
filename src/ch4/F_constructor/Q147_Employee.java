package ch4.F_constructor;

public class Q147_Employee {
	private String name;
	private int age;
	private int salary;

	public Q147_Employee(String name, int age) {
		setName(name);
		setAge(age);
		setSalary(2000);
	}
	public Q147_Employee(String name, int age, int salary) {
		this(name, age);
		setSalary(salary);
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

	public void printDetails(){
		System.out.println(name+ " : "+ age + " : "+ salary);
	}
}
class Test{
	public static void main(String[] args) {
		Q147_Employee e1 = new Q147_Employee();  //we need to create default constructor
		Q147_Employee e2 = new Q147_Employee("Jack", 50);
		Q147_Employee e3 = new Q147_Employee("Chloe", 40, 5000);

		e1.printDetails();
		e2.printDetails();
		e3.printDetails();
	}

}
/* Which is the result? !!! Look at question file (same 99)

A) Compilation fails in the Employee class

B) null : 0 : 0
	Jack : 50 : 0
	Chole : 40 : 5000

C) null : 0 : 0														>> if it can be compiled 
	Jack : 50 : 2000
	Chole : 40 : 5000

D) Compilation fails in the Test class								>> OK, Why?

E) Both the Employee class and the Test class fail to compile 			
*/