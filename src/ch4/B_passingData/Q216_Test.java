package ch4.B_passingData;

class Product{
    double price; 
}
public class Q216_Test {  // public class Test
   public  void  updatePrice(Product product,double price){
        price=price*2;
        product.price=product.price+price;
   }

    public static void main(String[] args) {
        Product prt=new Product(); 
        prt.price=200;
        double newPrice=100;

        Q216_Test t=new Q216_Test();
        t.updatePrice(prt,newPrice);
        System.out.println(prt.price+":"+newPrice);
    }
}
/*
What is the result?
 A. 200.0 : 100.0
 B. 400.0 : 200.0
 C. 400.0 : 100.0			>> OK
 D. Compilation fails.


 */
