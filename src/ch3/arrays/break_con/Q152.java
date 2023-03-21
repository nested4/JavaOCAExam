package ch3.arrays.break_con;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Q152 {

	
	public static void main(String[] args) {
		List <String> lst=Arrays.asList("A","B","C","D");
		Iterator<String> itr=lst.iterator();
		while(itr.hasNext()){
			String e=itr.next();
			if (e=="C") {
				break;
			}
			else {
				//continue;
				System.out.println(e);
			}
		}

	}

}

/*Which action enables it to print AB? (same Q222)
A. Comment lines 18 to 21.
B. Comment line 20.
C. Comment line 19.  >>OK
D. Comment line 16. 
*/
