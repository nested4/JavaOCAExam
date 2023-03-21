package ch4.A_heap_garbage;


public class  Q162_Test{
	public static void main(String[] args) {
		Student s1=new Student();  // id=40   << 
		Student s2=new Student();//	id=43	<< s3
		Student s3=new Student();//	id=76	<< s1
		s1=s3; 
		s3=s2;
		s2=null;
		System.out.println(s3.name);
		System.out.println(s2.name);

	}

}

class Student {
	String name;
	int age;
}

/* 162  Given the code fragments:

Which statement is true?
A. After line 11, three objects are eligible for garbage collection.
B. After line 11, two objects are eligible for garbage collection.
C. After line 11, one object is eligible for garbage collection.		>>OK
D. After line 11, none of the objects are eligible for garbage collection.

*/

