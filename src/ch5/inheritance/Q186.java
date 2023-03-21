package ch5.inheritance;

class S1{
	
    protected void display(int x){
        System.out.println("Parent" +x);
    }
}
class S2 extends S1 {
    public void display(int x, int y){
        this.display(x);
        display(y);
        super.display(y);
    }
    public void display(int x){
        System.out.println("Child " +x);
    }
}

public class Q186{
    public static void main(String[] args) {
        S2 sobj = new S2(); 
        sobj.display(10, 100);
       
    }
}

/*
What is the result?
A. 
	Child 10
	Child 100
	Parent 100
B. 
	Parent 10
	Child 10
	Parent 1000
C. 
	Child 10
	Parent 100
	Parent 100

D.  A compile time error occurs.

* */

/** Attention to overriding and this/super
 Attention to line 14, there is small green rectangle
 
 Method Overriding, p.247 
 The compiler performs the following checks when you override a nonprivate method:
1. The method in the child class must have the same signature as the method in the parent class.
2. The method in the child class must be at least as accessible or more accessible than the method in the parent class.
3. The method in the child class may not throw a checked exception that is new or broader than the class of any exception thrown in the parent class method.
4. If the method returns a value, it must be the same or a subclass of the method in the parent class, known as covariant return types.
 
 	Covariant return type refers to return type of an overriding method. It allows to narrow down return type 
 	of an overridden method without any need to cast the type or check the return type. 
 	Covariant return type works only for non-primitive return types.

 Any time you see a method that appears to be overridden on the example, 
 1-first check to make sure it is truly being overridden and not overloaded. 
 2-Once you have confirmed it is being overridden, 
 	check that the access modifiers, return types, and any exceptions defined in the method are compatible with one another. 

For rule 2
TABLE 4.2 Access modifiers, p.180
 private (in class) < default (in package) < protected (in package or subclasses)< public  (any)
 
 * In case no overriding, what is the result?
 * */
