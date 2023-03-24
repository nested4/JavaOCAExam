package ch1.packages;

public class Q48_Test {  //public class Test
	// line n1
	
	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Otherclass a=new Otherclass();
//	}
	
}

/* 48. Which two code fragments can be inserted at line n1? 
A. String str = “Java”;							>> OK
B. for(int iVal = 0; iVal <=5; iVal++){}
C. Test() {}									>> OK
D. package p1;
E. import java.io.*; 



 */ 

/***** NOTES
 
-Package Declarations and Imports, p.9
1.Java puts classes in packages. These are logical groupings for classes.
2. Import statements tell Java which packages to look in for classes. 
Since you didn’t tell Java where to look for any other class, it has no clue.

- Wildcards, p.10

 1: to add a specific element / method write the name
 	imports java.util.Random;
 2: to add all elements of a package use '.*'
 	import java.util.*;
	It doesn’t import child packages, fields, or methods; it imports only classes
 3: special type of import called the “static import” that imports other types (ch4)

-Ordering Elements in a Class, Table 1.4, p.34

 Package declaration package abc; 			First line in the file
 Import statements import java.util.*; 		Immediately after the package
 Class declaration public class C 			Immediately after the import
 Field declarations int value;		 		Anywhere inside a class
 Method declarations void method()			Anywhere inside a class

!!! We can put comments anywhere, and white characters (spaces, tab, new line ...) are ignored in byte code

* Chapter 7. Packages
 https://docs.oracle.com/javase/specs/jls/se8/html/jls-7.html 
 	CompilationUnit:
	[PackageDeclaration] {ImportDeclaration} {TypeDeclaration}
	So, you've got to have zero or one package declarations, 
	then zero or more import declarations, then zero or more type declarations.


*****/