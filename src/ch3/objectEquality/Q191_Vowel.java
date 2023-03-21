package ch3.objectEquality;

  class Q191_Vowel{
    private char var;

    public static void main(String[] args) {
        char var1 = 'a';
        char var2 = var1;
        var2 = 'e';

        Q191_Vowel obj1 = new Q191_Vowel();
        Q191_Vowel obj2 = obj1;  // object are equalized, so change on any one of them will affect both
        obj1.var = 'o';  // both are o
        obj2.var = 'i'; // both are i
        
        System.out.println(var1+ ", " +var2 );
        System.out.println(obj1.var+ ", " +obj2.var);
    }
}

/*
* What is the result?
A. 	a, e 			>>OK
 	i, i
B. a, e
	o, o
C. e, e
	i, i
D. a, a
	o, o

* */
