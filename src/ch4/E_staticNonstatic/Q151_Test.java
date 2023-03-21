package ch4.E_staticNonstatic;


class Alpha_1{

	int ns;
	static int s; 

	Alpha_1(int ns){
		if(s<ns){
			s = ns;
			this.ns = ns;
		}
	}
	void doPrint(){
		System.out.println("ns = "+ns+" s = "+s);
	}
}
public class Q151_Test{
	public static void main(String[] args) {
		Alpha_1 ref1 = new Alpha_1(100);
		Alpha_1 ref2 = new Alpha_1(50);
		Alpha_1 ref3 = new Alpha_1(125);

		ref1.doPrint();
		ref2.doPrint();
		ref3.doPrint();
	}

}



/*What is the result?  (same 82)
A							>>OK
ns = 100 s = 125
ns = 0 s = 125
ns = 125 s = 125

B. 
ns = 50 s = 50
ns = 125 s = 125
ns = 0 s = 125

C. 
ns = 50 s = 125 
ns = 125 s = 125 
ns = 0 s = 125

D. 
ns = 50 s = 50 
ns = 125 s =125 
ns = 100 s =100

A.	Option A  >>OK
B.	Option B
C.	Option C
D.	Option D

*/


