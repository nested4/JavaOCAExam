package ch3.date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Q016 {

	public static void main(String[] args) {
		LocalDateTime dt = LocalDateTime.of(2014, 7, 31, 1, 1);
		dt.plusDays(30);  
		dt.plusMonths(1);
		System.out.println(dt.format(DateTimeFormatter.ISO_DATE));
	}
}
/*What is the result?
A.	An exception is thrown at runtime. 
B.	07-31-2014 										
C.	2014-07-31  					>> OK
D.	2014-09-30		 								

*/

/** NOTES
1. The date and time classes are immutable(not changeable)  which means the return value must be saved.
So any date method does not affect its own object.
 


?? System.out.println(dt.format(DateTimeFormatter.ISO_DATE_TIME)); the same Q148
*/