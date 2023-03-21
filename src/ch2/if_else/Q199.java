package ch2.if_else;

public class Q199 {
    public static void main(String[] args) {
        String stuff = "TV";
        String res = null;

        if (stuff.equals("TV")) {
            res = "Walter";
        } else if (stuff.equals("Movie")) {
            res = "White";
        } else {
            res = "No Result";
        }
    }
}

/* 199. Which code fragment can replace the if block?
A) stuff.equals("TV") ? res = "Walter": stuff.equals("Movie") ? res = "White" : res = "No Result";
B) res = stuff.equals("TV") ? "Walter" else stuff.equals("Movie") ? "White" : "No Result";
C) res = stuff.equals("TV") ? stuff.equals("Movie") ? "Walter" : "White" : "No Result";
D) res = stuff.equals("TV") ? "Walter": stuff.equals("Movie") ? "White" : "No Result";		>> OK

 */

/******* Notes
1: conditional operator or Ternary Operator : p.71
	It is represented by two symbols: '?' and ':'
	It takes three operands and is of the form:
		booleanExpression ? expression1 : expression2
	equal : if-then-else statement

- 
A. 'res' ?
B. else ? 
C. "walter" ?
*******/