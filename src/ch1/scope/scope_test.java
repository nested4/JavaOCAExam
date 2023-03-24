package ch1.scope;

public class scope_test {

	public static void main(String[] args) {
		
//		loop example
		for (int iterator = 0; iterator<=10;iterator++) {
			System.out.println(iterator); //in scope
		}
	//	iterator ++;// out of scope
		
		
		// Simple bracket example		
		{
			int numberInBrackets = 0;
			numberInBrackets = 2; //in scope
		}
//		numberInBrackets =1; // out of scope
	}

}
