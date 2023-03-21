package ch4.A_heap_garbage;


public class Q087_MarkList{
    int num ;
    public static void graceMarks(Q087_MarkList obj4){

        obj4.num += 10;
    }

        public static void main(String[] args) {
        	Q087_MarkList obj1 = new Q087_MarkList();
        	Q087_MarkList obj2 = obj1;
        	Q087_MarkList obj3 = null;
            obj2.num = 60;
            graceMarks(obj2);
            
        }
    }

    /*
    How many MarkList instances are created in memory at runtime?
    A. 1				>> OK
    B. 2
    C. 3
    D. 4
   
     */

/** NOTES
 garbage collection
 Objects vs. References, p.37
 
 draw what’s going on the heap 
 
 how many new keyword there are?
 obj1 and obj2 refer the same object in the memory
 no memory allocation for obj3, only reference creation on stack
 */

