package ch4.D_encapsulation;
//Given these two classes

public class Q109_Customer {
	//ElectricAccount acct=new ElectricAccount();
	public  void useElectricity(double kWh){
	//	acct.addKWh(kWh);
		
	}
}

//public class ElectricAccount{
//		private  double kWh;
//		private double rate=0.07;
//		private double bill;
//		//line1
//
//	}
/**NOTES 
 Attention to access modifiers (private, public, default, protected)
 Understanding the requirements from text is important
 Encapsulating Data, p.205
 */

/*
Any amount of electricity used by a customer (represented by an instance of the Customer class)
  must contribute to the customer's bill (represented by the member variable bill) through the useElectricity method.
An instance of the Customer class should never be able to tamper with or decrease
  the value of the member variable bill.
How should you write methods in the ElectricAccount class at line n1 so that the member
  variable bill is always equal to the value of the member variable kwh multiplied by the member variable rate?

A  >> with negative kWh, bill can be decreased
	
	public void addKWh(double kWh){			
      this.kWh+=kWh;
      this.bill=this.kWh*this.rate;}
B  
	public void addKWh(double kWh){
      if(kWh>0){
      	this.kWh+=kWh;
      	this.bill=this.kWh*this.rate; }}

C  >> private function, Customer can not access
	
	private void addKWh(double kWh){
       if(kWh > 0){
          this.kWh+=kWh;
          this.bill=this.kWh*this.rate; }}

D 	>> you can not use public setBill,  !! An instance of the Customer class should never be able to ...			
	public void addKWh(double kWh){
        if(kWh>0){
            this.kWh +=kWh;
            setBill(this.kWh);
         }
     }
     public void setBill(double kWh){
          bill=kWh*rate;
     }

  A. Option A
  B. Option B		>>OK
  C. Option C
  D. Option D

 */