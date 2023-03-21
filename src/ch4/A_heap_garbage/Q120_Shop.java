package ch4.A_heap_garbage;

class Cart {

	Product_Q120 p;
	double totalAmount;	
	}
	
class Product_Q120 {
	String name;
	Double price;
}

 public class Q120_Shop { // public class Shop
	public static void main(String[] args) {
	
		Cart c = new Cart();
		System.out.println(c.p + ":" + c.totalAmount );
	
	}

}
/*What is the result?
A. null:null:0.0				>> When?
B. null:null
C. <<HashCode>>:0.0				>> When?
D. null:0.0						>>OK

*/
 
 /** NOTES
 Attention:
 1-Is there any object creation? 
 	try two modifications together and and alone  
 	Product_Q120 p =new Product_Q120();
 	System.out.println(c.p.name + ":" + c.p.price + ":" + c.totalAmount );
 	
 	
 2-Default value of variables
 

 */