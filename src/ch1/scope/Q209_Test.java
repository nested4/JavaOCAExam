package ch1.scope;

public class Q209_Test { //public class Test
	int x, y;
	public Q209_Test(int x1,int y1){
		initialize(x1,y1);	
	}
	public void  initialize(int x,int y){
		this.x=x*x;
		this.y=y*y;
	}
	public static void main(String[] args){
		int x=9,y=5;
		Q209_Test obj=new Q209_Test(x,y);
		System.out.println(x+" "+y);
	}
}


/*
 209. what is the result? (same Q17)
A. 9 5			>> OK, local variables	
B. 81 25		>> class variables 	>> for option B run: System.out.println(obj.x+" "+obj.y);
C. compilation fails
D. 0 0
 */
