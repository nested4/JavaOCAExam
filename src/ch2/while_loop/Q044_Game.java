package ch2.while_loop;

public class Q044_Game {
	public static void menu() {
		System.out.println("1. Left 2. Right 0. Stop");
	}
	public static void main(String[] args) {
		int option;
		
		/* insert code here */ 
		
	}
}
/* 44. Given the code fragment and the requirements of the application:
-> 	It must display the menu.
-> 	It must print the option selected.
-> 	It must continue its execution till it reads ‘0’.

Which code fragment can be used to meet the requirements?


A. >>		no calling statement for menu()
	
	for (option = 0; option !=0; option = // code that reads the option goes here){
	//code that print the option goes here 
	}

B. >>		option is not initialized or read
	while (option !=0){
		menu();
		option = //  code that reads the option goes here
		//code that print the option goes here 
	}

C. >> OK >> do-while, at least one time display menu and read the option 
	do {
		menu();
		option = //  code that reads the option goes here
		//code that print the option goes here 
	}while (option != 0);


	*** sample usage with whole code
	 Scanner input = new Scanner(System.in);
	 int option;
	 do {
			menu();
			System.out.println("What is your choice?");
			option = input.nextInt();
			if (option == 1) {
				System.out.println("You chose Left");
			}else if (option == 2) {
				System.out.println("You chose Right");		
			}
	}while (option != 0);


D. >> option is not initialized or read 

	while (option >= 0){
		menu();
		option = //  code that reads the option goes here
		//code that print the option goes here 
	}

A. Option A 		
B. Option B 
C. Option C			>> OK
D. Option D 

 */