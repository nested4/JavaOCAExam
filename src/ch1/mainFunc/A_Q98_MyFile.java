package ch1.mainFunc;

class A_Q98_MyFile {  //public class MyFile
	
    public static void main(String[] args) {
        String arg1= args[1];
        String arg2= args[2];
        String arg3= args[3];
        System.out.println("Arg is " + arg3);
    }
}
/*
Which command-line arguments should you pass to the program to obtain the following output? Arg is 2

A. java MyFile 1 3 2 2       >> 4 arguments, 4th. argument (args[3]) is 2, OK
B. java MyFile 2 2 2		 >> 3 arguments, NOT OK
C. java MyFile 1 2 2 3 4	 >> 5 arguments, 4th. argument (args[3]) is 3, NOT OK
D. java MyFile 0 1 2 3		 >> 4 arguments, 4th. argument (args[3]) is 3, NOT OK

Answer: A
*/

/******** Notes
 1. in main() function: p.6 
 	1: usage: String[] args, String args[] or String... args >> All usages are ok
 	2: variable name: args (any other names are ok)
 	3: variable type: String array
		All kind of entry: number, string, character => String
			123, bank, #
	4:values: were read in (arguments) when the JVM started 

2: running command-line
	javac Classname.java   			>> to compile
	Classname.class
	java Classname  [arguments]  	>> to run
	
3: argument separator: space. !! in quotes "" can be spaces but they are ignored
	Single (') or double (") quotes can be used to enclose arguments that contain whitespace characters
 	java myfile zeliha gormez 2345 >> 3 arguments
	java myfile "zeliha gormez" 2345 >> 2 arguments

4: That’s right: array indexes begin with 0 in Java. 
 	args[0] accesses the first element of the array.

5: !! passed argument length, ! needed argument length, ! accessed arguments
 	java.lang.ArrayIndexOutOfBoundsException >> not enough arguments

6: Eclipse > Run> Run Configurations> Arguments
 
*********/