package ch4.C_methods;

public class Q219_SumTest { //public class  SumTest
    public static void doSum(Integer x,Integer y){
        System.out.println("Integer sum is "+(x+y));
    }
    public static void doSum(double x,double y){
        System.out.println("double sum is "+(x+y));
    }
    public static void doSum(float x,float y){
        System.out.println("float sum is "+(x+y));
    }
   
    
    public static void main(String[] args) {
        doSum(10,10);
        doSum(10.0,20.0);
    }
}
/*
What is the result?  (exactly the same Q145)
A  float sum is 30.0
   double sum is 30.0
B  double sum is 30.0
   float sum is 30.0
C  Integer sum is 30
   double sum is 30.0
D  Integer sum is 30
   float sum is 30.0

A Option A  			>> OK
B Option B
C Option C
D Option D

 */

/** Overloading Methods, p.191
 T A B L E 4 . 4 Order Java uses to choose the right overloaded method, p.195
 */
