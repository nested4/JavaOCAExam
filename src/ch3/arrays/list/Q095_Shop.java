package ch3.arrays.list;
import java.util.*;

class Product{
	int id;
	String name;
	
	public  Product(int id, String name) { 
		this.id = id;
		this.name = name;
	}
}
public class Q095_Shop {
	
	public static void main(String[] args) {
		
		List<Product> lst = new ArrayList<>() ;
		lst.add(new Product(10, "IceCream")); 
		lst.add(new Product(11, "Chocolate"));
		Product p1 = new Product(10, "IceCream");
		
		System.out.println(lst.indexOf(p1));
		}
	}
/* 95. What is the result?
		A. true
		B. false
		C. -1				>>
		D. 0
		
 */

/** NOTES
 Object also can be used in ArrayList
 indexof() : returns the lowest index i such that (o==null ? get(i)==null : o.equals(get(i))), 
 	or -1 if there is no such index.

 !!Object equality
 what is the result in this case:
 	lst.add(p1);
 **/
