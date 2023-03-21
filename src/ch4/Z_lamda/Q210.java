package ch4.Z_lamda;

import java.util.function.Predicate;

public class Q210 {

	public static void main(String[] args) {
		Predicate<Integer> p= (n) -> n%2==0;
	
		
	}
}
/* 210. which code snippet at line 9 prints true?
A. 
	Boolean s=p.apply(101);					>> two problems name of method, and result is false
	System.out.println(s);
B.
	Boolean s=p.test(100);					>> OK
	System.out.println(s);
C.
    Integer s=p.test(100);					>> ??
    if(s==1){
      System.out.println("false");
    }else{
      System.out.println("true");
    }
    
D.   System.out.println(p.apply(100));		>> just one method, test is ok

A. Option A
B. Option B				>>OK
C. Option C
D. Option D

 */

/** NOTES
Predicate<Integer> p1=(Integer n) ->{ return n%2==0; };
p1.test(100);
*/