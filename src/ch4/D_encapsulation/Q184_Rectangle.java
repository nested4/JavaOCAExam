package ch4.D_encapsulation;

public class Q184_Rectangle {
    private double length;
    private double heigth;
    private double area;

    public void setLength(double length){
        this.length = length;
    }
    public void setHeigth(double heigth){
        this.heigth = heigth;
    }

    public void setArea(){
        area = length*heigth;
    }
}

/*
Which two changes would encapsulate this class and ensure that the area field is always equal to length * height whenever the Rectangle class is used?
A.	Call the setArea method at the end of the setHeight method.   		>> OK
B.	Call the setArea method at the beginning of the setHeight method.
C.	Call the setArea method at the end of the setLength method.			>> OK
D.	Call the setArea method at the beginning of the setLength method.
E.	Change the setArea method to private.								>> OK
F.	Change the area field to public.
Answer: AC

 */

/** NOTES:
 Bu soru için internetteki kaynaklara baktım. Çoğu A ve E demiş. 
 Ancak bu kaynaktaki yorumlarda bir kişi güzel özetlemiş. A-E doğru olsaydı, C-E de doğru olurdu. 
 Zira Area hem Length hem Height değişkenlerine bağlı. Aslında en doğru cevap A-C-E.  
 "Make method "setArea" to private is optional, but recommended. 
 Interesting questing. A + C answers are mandatory and E is optional." 
 https://www.examtopics.com/discussions/oracle/view/1833-exam-1z0-808-topic-1-question-129-discussion/
 */
