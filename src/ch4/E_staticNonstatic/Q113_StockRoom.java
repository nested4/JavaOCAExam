package ch4.E_staticNonstatic;

public class Q113_StockRoom {
	private  static int stock=10;
	private static  int qty;

	public  void purchase(int qty){stock +=qty;
	//this.qty=qty;
	}
	public  void sell(int qty){stock -=qty;
	//this.qty=qty;
	}
	public static void printStock(String action){
		System.out.println(action+":"+ qty + " items. Stock in Hand: " +stock);
	}

	public static void main(String[] args) {
		Q113_StockRoom k1=new Q113_StockRoom();
		k1.sell(5);
		k1.printStock("Sold");
		Q113_StockRoom k2=new Q113_StockRoom();
		k2.purchase(5);
		k2.printStock("Purchased");
	}
}
/*You want the code to print:
Sold: 5 items. Stock in Hand: 5 
Purchased: 5 items.Stock in Hand: 10? 
Which action enables the code to print this?
  A. Declare the stock variable and the purchase(), sell(), and printStock() methods static.
  B. Declare the stock variable and the printStock() method static.
  C. Declare the stock and qty variables and the printStock() method static.
  D. Declare the stock variable static.
Answer: C
 */

/** NOTES
 stock must be static. In the other case, for each object creation it starts 10

 Also, modify sold and purchased method to update global qty value
 */
