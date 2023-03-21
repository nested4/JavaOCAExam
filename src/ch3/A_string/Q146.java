package ch3.A_string;

public class Q146 {

	public static void main(String[] args) {

		String[] strs=new String[2];
		int idx=0;
		for (String s : strs) {
			strs[idx]=strs[idx].concat("element "+idx);
			idx++;
		}
		for (idx = 0; idx < strs.length; idx++) {
			System.out.println(strs[idx]);

		}
	}
}
/* 146. What is the output?  (same Q011)
A. Element 0Element 1
B. Null element 0Nullelement 1
C. NullNull
D. A null pointer exception is thrown at runtime.    >> OK
 */

/** NOTES
 !!! attention to initializing
 String array default value is null.
 null is not an object and has no any function including concat()
 */


