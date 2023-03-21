package ch5.abstrct.Q076;

public class Q076 {

}
abstract class Planet{
    public void revolve(){	//line 2

    }
    abstract void rotate();		// line 4
}
class Earth extends Planet{
    private void revolve(){ //line8

    }
    private void rotate(){ //line 10

    }
}
/*
Which two modifications enable the code to compile? (Same 45)
or question might be three modifications

A.  Make the method at line 8 protected.		>>OK
B.	Make the method at line 8 public.		>>OK
C.	Make the method at line 10 protected.	>>OK
D.	Make the method at line 4 public.
E.	Make the method at line 2 public.

AC or BC
 */

/** Attention to overriding
Rule 2. The method in the child class must be at least as accessible or more accessible than the method in the parent class.

TABLE 4.2 Access modifiers, p.180
 private (in class) < default (in package) < protected (in package or subclasses)< public  (any)
 */
