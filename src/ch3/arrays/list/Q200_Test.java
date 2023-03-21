
package ch3.arrays.list;
import java.util.ArrayList;
import java.util.List;

class Patient{
    String name;
    public Patient(String name){
        this.name=name;
    }
}
public class Q200_Test {  // public class Test
   
	public static void main(String[] args) {
        List<Patient> ps=new ArrayList<Patient>();
        Patient p2=new Patient("Mike");
        ps.add(p2); 
    

        // insert code here
        
        if (f>=0){
            System.out.println("Mike found");
        }
    }

}



/* Which code fragment, when inserted at line 14, enables the code to print Mike Found?
 * 
 A.		>> OK, for if condition, needs a variable named "f" 
 	 int f=ps.indexOf(p2);	
 	 
 B.		>> attention creation
 	int f= ps.indexOf(Patient("Mike"));
 
 
 C. 
 	int f= ps.indexOf(new Patient("Mike"));
 D.
 		Patient p=new Patient("Mike");
 		int f = ps.indexOf(p);
 */

/**NOTES
 indexOf(): Returns the index of the first occurrence of the specified element in this list, 
 	or -1 if this list does not contain the element. 
 
 More formally, returns the lowest index i such that (o==null ? get(i)==null : o.equals(get(i))), or -1 if there is no such index.

!! attention object equality
 **/
