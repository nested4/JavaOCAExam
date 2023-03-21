package ch3.date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Q003 {
	
	public static void main(String[] args) {
		String date = LocalDate
							  .parse("2014-05-04") 											
							  .format(DateTimeFormatter.ISO_DATE_TIME);  	
		System.out.println(date);
	}
}



/*
What is the result?
A. May 04, 2014T00:00:00.000
B. 2014-05-04T00:00: 00.000
C. 5/4/14T00:00:00.000
D. An exception is thrown at runtime.  		>> ?? has LocalDate any time? Unsupported field: HourOfDay


*/

/** NOTES
Date and time, p.138
TABLE 3.5 ofLocalized methods, summary, Exam Essentials
1. Attention to LocalDateTime or  LocalDate 
2. format includes date, time or date_time	

!Recognize invalid uses of dates and times. 
LocalDate does not contain time fields and LocalTime does not contain date fields. 
Watch for operations being performed on the wrong time. 

Also watch for adding or subtracting time and ignoring the result.
date is immutable like String 
 */
