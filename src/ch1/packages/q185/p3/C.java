package ch1.packages.q185.p3;

//line n2
//public class C {
//	public static void main(String[] args) {
//		A o1=new A();
//		B o2=new B();
//	}
//
//}

/*185. Which modification enables the code to compile?

A. Replace line n1 with:
	import p1.*;
   Replace line n2 with:
    import p1.p2.*;			>> for A ?

B. Replace line n1 with:
	import p1.A;
   Replace line n2 with:
    import p1.*;          >> is it  enough to access  B? 

C. Replace line n1 with:  >> OK
	import p1.A;
   Replace line n2 with:
    import p1.A;import p1.p2.B ; 

D. Replace line n1 with:
	import p1;				>> only package name?
   Replace line n2 with:
   	import p1;import p1.p2;
 */

/***** NOTES
1:	import needed package to access class A and class B

!! Attention to wildcards
*******/