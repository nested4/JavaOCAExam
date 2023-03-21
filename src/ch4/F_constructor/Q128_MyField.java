package ch4.F_constructor;

public class Q128_MyField {
	int x;
	int y;
	public void doStuff(int x, int y) {
		x = x;
		y = this.y;

		
	}
	public void display() {
		System.out.print(x + " " + y + " : ");
	}
	
	public static void main(String[] args) {
		Q128_MyField m1 = new Q128_MyField();
		m1.x= 100;
		m1.y = 200;
		Q128_MyField m2 = new Q128_MyField();
		m2.doStuff(m1.x, m1.y);
		m1.display();
		m2.display();
//Answer A.  100 200 : 0 0 :
	}
}

/** NOTES
 Attention to position of "this"
 y = this.y;
 this.y = y;
 doStuff() >> no any affect to Instance variables
 */
