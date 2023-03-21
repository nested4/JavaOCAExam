package ch2.operators;

public class Q070 {
	public static void main(String[] args) {
        int x = 10;
        int y = ++x;
        int z = 0;

        if(y >= 10 | y<= ++x ){
            z = x;
        }else {
            z = x++;
        }
        System.out.println(z);
    }

}


/*
What is the result?
A. 11
B. 10
C. 12 			>> OK. increase x two times at line 6 and line 9
D. A compile time error occurs.
 */


/** NOTES
!!Attention to OR operator "|"
??
in this case, the result is 11. Because first condition is enough to make a decision, so second condition is not evaluated.
if(y >= 10 || y<= ++x )

Why do we usually use || over |? What is the difference?
|| >> Evaluating the first condition is enough, skip the rest
|  >> Evaluate all conditions.

 https://stackoverflow.com/questions/7101992/why-do-we-usually-use-over-what-is-the-difference
 https://stackoverflow.com/questions/35301/what-is-the-difference-between-the-and-or-operators/35314https://stackoverflow.com/questions/35301/what-is-the-difference-between-the-and-or-operators/35314
*/