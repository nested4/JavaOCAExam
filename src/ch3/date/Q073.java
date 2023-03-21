package ch3.date;

import java.time.LocalDate;

public class Q073 {
	public static void main(String[] args) {
        LocalDate date= LocalDate.of(2012, 1, 30);
        date=date.plusDays(10);
        System.out.println(date);
    }

}
/*
73. What is the result? (Exactly the same Q73)
A. 2012-02-10 00:00
B. 2012-01-30				>> OK
C. 2012-02-10
D. A DateTimeException is thrown at runtime.

*/

/** NOTES
 ? what must be done to achieve this result: 2012-02-09
 */

