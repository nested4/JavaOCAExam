package ch5.inheritance.Q170_202;


/**public class Employee {
    public int salary;
}
public class Manager extends Employee{
    public int budget;
}
public class Director extends Manager{
    public int stockOptions;
}
*/
public class Q202 {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Employee manager = new Manager();
        Employee director = new Director();
        // n1line
        

    }

}
/** !! look at this question after casting and then compare to Q170 */

//And given the test method:
/*
Which two options compile when placed at line n1 of the main method? (Choose two.) (same 170: fail)
A.	director.stockOptions = 1_000;
B.	employee.salary = 50_000;				>>OK
C.	manager.budget = 1_000_000;
D.	manager.stockOption = 500;
E.	employee.budget = 200_000;
F.	director.salary = 80_000;				>>OK
 */
/** Attention to Object casting, Object vs. reference, p.280,281
 !! Different type declaration at the left (reference type) and right side (Object type)
 reference type deals with accession limit
 Object type deals with the object is already created in memory
 */
