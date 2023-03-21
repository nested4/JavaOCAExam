package ch3.arrays.list;

import java.util.ArrayList;
import java.util.List;

public class Q221 {
    public static void main(String[] args) {
        List colors=new ArrayList();
        colors.add("green");
        colors.add("blue");
        colors.add("red");
        colors.add("yellow");
        colors.remove(2);
        colors.add(3,"cyan");
        System.out.println(colors);
    }
}
 /*   What is the result?
A. [green, red, yellow, cyan]
B. [green, blue, yellow, cyan] 			>> OK
C. [green, red, cyan, yellow]
D. An IndexOutOfBoundsException is thrown at runtime.
        
*/

/**NOTES
 1. Attention to index starts from 0
 2. pass index or object : remove(2) => remove("yellow")
 3. add in specific index
 ??  colors.set(1,"white");
 
 ?? How can the warning be solved?
 */
