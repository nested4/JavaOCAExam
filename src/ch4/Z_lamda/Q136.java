package ch4.Z_lamda;

import java.util.ArrayList;
import java.util.List;

public class Q136 {
	public static void main(String[] args) {
		
	List<String> arrayList=new ArrayList<>();
	arrayList.add("Tech");
	arrayList.add("Expert");
	arrayList.set(0,"Java");
	arrayList.forEach(a-> a.concat("Forum")); 
	System.out.println(arrayList);  //to see no changing in array
	arrayList.replaceAll(s-> s.concat("Group"));
	System.out.println(arrayList);
	
	
	}	
}
/*
What is the result?
A. [JavaForum, ExpertForum]
B. [JavaGroup, ExpertGroup]			>> OK
C. [JavaForumGroup, ExpertForumGroup]
D. [JavaGroup, TechGroup ExpertGroup]

*/

/** NOTES
forEach : Performs the given action for each element   !!! no effect, just apply 
Parameters:
	action The action to be performed for each element

The default implementation behaves as if:
for (T t : this)
         action.accept(t);
         
 replaceAll: Replaces each element of this list with the result of applying the operator to that element.
*/