package ch4.B_passingData;

public class test_pass {
	
	private static void change(String name){
	    System.out.println("There goes " + name + "!");
	    name="Mike";  // ==> create a new String in pool
	    System.out.println("There goes " + name + "!");
	}
	private static void changeInt(Integer iw){
	    System.out.println("There goes " + iw + "!");
	    iw=34;  //==> iw=new Integer(34);
	    System.out.println("There goes " + iw + "!");
	}

	public static void main(String[] args){
	    String hisName = "John";
	    String myName = hisName;
	    System.out.println(hisName);
	    System.out.println(myName);
	    change(myName);
	    System.out.println(hisName);
	    System.out.println(myName);
	    
	    
	    Integer iw=new Integer(12);
	    System.out.println(iw);
	    changeInt(iw);
	    System.out.println(iw);
	    
	}

}
