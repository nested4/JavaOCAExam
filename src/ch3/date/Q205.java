package ch3.date;

import java.time.LocalDate;

public class Q205 {
    public static void main(String[] args) {
        LocalDate date=LocalDate.of(2012,1,30);
        date.plusDays(10);
        System.out.println(date);
    }
 
}
/* 205. What's the result? (Exactly the same Q73)
A.2012-02-10
B.2012-01-30					>>
C.2012-02-10 00:00
D. A DateTimeExceptions is thrown at runtime

 */

/** !! attention date is immutable like String 
 * 
 */
