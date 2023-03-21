package ch6;

class E1 extends Exception{ 
}
class E2 extends RuntimeException{
}
 public class Q190_App{
    public void m1() {
        System.out.println("m1.Accessed.");
        throw new E1();
    }
    public void m2(){
        System.out.println("m2.Accessed.");
        throw new E2();
    }
    public static void main(String[] args) { 
        int level =1;   							
        Q190_App obj = new Q190_App();
        if (level <= 5 && level >= 3){ 
            obj.m1();
        } else { 
            obj.m2();  
        }
    }
}

/* Which statement is true?
A. The program prints m1.Accessed.
B. The program fails compile due to the unhandled E1 exception.			>>OK, must be handled in compile time
C. The program prints m2.Accessed.
D. The program fails to compile due to the unhandled E2 exception.		>> no needs in compile time but it causes a RuntimeException
*/ 
 
/**
Unchecked: RuntimeExceptions are NOT checked by compiler in compile time, no need throws
Checked: Exceptions are checked by compiler in compile time, it must be handled in compile time, needs  throws or try/catch

After handling?
 * */
