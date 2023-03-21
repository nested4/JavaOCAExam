package ch5.abstrct.Q213;

abstract class Toy {
	int price;
	//line n1;
	

}
/* Which three code fragments are valid at line n1?
 A. >> OK, a valid non-abstract method
  	
  	public static void insertToy(){
        //*  code goes here  *
    }

 B. >> !! no new with an abstract class 
     
     final Toy getToy(){
        return new Toy();
   	 }
 C.	>> !! each method needs body except an abstract method
 	
 	public void printToy() 
  
 D. >> OK, a valid non-abstract method
  	public int calculatePrice(){
       return price;
   	}
 E. >> OK, a valid abstract method
 	public abstract int computeDiscount();


    A. Option A		>>OK
    B. Option B
    C. Option C
    D. Option D		>>OK
    E. Option E		>>OK

 */
