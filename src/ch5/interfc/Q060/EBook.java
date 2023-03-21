package ch5.interfc.Q060;

interface Readable {
	
	public void readBook();
	public void setBookMark();
}

abstract class Book implements Readable {  		// line n1
	public void readBook() { }	
	// line n2    
}
 class EBook extends Book { 						// line n3
	public void readBook() { }
	// line n4
	
}

/* And given the code fragment:
  Book book1 = new EBook(); 
  book1.readBook();
 
 Which option enables the code to compile? 
 
A. >> it means make it concrete class, in this case needs implementation of all abstract methods
	Replace the code fragment at line n1 with:
	class Book implements Readable{
	
B.	>> abstract class, no needs to write again an abstract methods. No effect and it doesn't solve the problem
	At line n2 insert:
	public abstract void setBookMark();
	
B. >> it means make it abstract class. In this case, new EBook() doesn't work
	Replace the code fragment at line n3 with:
	abstract class EBook extends Book{
	
D. >> OK , The type EBook must implement the inherited abstract method Readable.setBookMark()
	At line n4 insert:
	public void setBookMark(){}

*/

/** 
 Attention to overriding rules
!!! look at all the top level classes to check whether there is any unimplemented methods which have no-body
?? what is the difference between overriding and implementation of a method
look at line 10 and line 14, which is overriding which is implementation
 */
