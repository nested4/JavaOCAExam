package ch2.if_else;

public class Q059 {

	public static void main(String[] args) {
		double discount = 0;
		int qty = Integer.parseInt(args[0]);
		// line n1
		
	 	System.out.println(discount);
	}
}
/*
 And given the requirements:
 If the value of the qty variable is greater than or equal to 90, discount = 0.5 
 If the value of the qty variable is between 80 and 90, discount = 0.2
	
Which two code fragments can be independently placed at line n1 to meet the requirements? (Choose two.)
	
A. if (qty >= 90) {discount = 0.5;}							>> OK
   if (qty > 80 && qty < 90) {discount = 0.2;}
	 	 
B. discount = (qty >= 90) ? 0.5 : 0;
   discount = (qty > 80) ? 0.2 : 0;

C. discount = (qty >= 90) ? 0.5 : (qty > 80) ? 0.2 : 0;				>> OK
	 	 
D. if (qty > 80 && qty < 90) {
	 	 discount = 0.2;
   } else{
	 	 discount = 0;
   }
   if (qty >= 90) {
	 	 discount = 0.5;
   }else {
	 	 discount = 0;
   }
	 	 
E.  discount = (qty > 8) ? 0.2 : (qty >= 90) ? 0.5 : 0;
*/
/** NOTES
 FIGURE 2.2 The structure of an if-then statement, p.67
 FIGURE 2.3 The structure of an if-then-else statement, p.69
 
 conditional operator or Ternary Operator : p.71
	It is represented by two symbols: '?' and ':'
	It takes three operands and is of the form:
		booleanExpression ? expression1 : expression2
	equal : if-then-else statement
 */
