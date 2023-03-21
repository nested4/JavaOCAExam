package ch5.oop;

public class Q173 {

}
/* 173. Given these requirements:   
Bus and Boat are Vehicle type classes.
The start() and stop() methods perform common operations across the Vehicle class type. 
The ride() method performs a unique operations for each type of Vehicle. 

Which set of actions meets the requirements with optimized code?

A. 	>> needs implementation for an abstract method ride()
	1. Create an abstract class Vehicle by defining start() and stop() methods, and declaring the ride() abstract method.
	2. Create Bus and Boat classes by inheriting the Vehicle class and overriding the ride() method.

B.	>> needs implementation for an abstract method ride()
	1. Create an interface Vehicle by defining start() and stop() methods, and declaring the ride() abstract method.
	2. Create Bus and Boat classes by implementing the Vehicle class.

C. 	>>  needs implementation for all abstract methods stop(), start(), and ride() not overriding 
	>>  needs different action between start()/stop() -->common operations and ride() -->unique operations
	1. Create an abstract class Vehicle by declaring stop(), start(), and ride() abstract methods.
	2. Create Bus and Boat classes by inheriting the Vehicle class and overriding all the methods.

D. 	>> OK ?? default start()/stop() -->common operations and override the default ride() -->unique operations
	1. Create an interface Vehicle by defining default stop(), start(), and ride() methods.
	2. Create Bus and Boat classes by implementing the Vehicle interface and overriding the ride() method. 

 * 
 */


/** 
 * All methods of Interface are already abstract method w/o abstract key, so need implementation
 * 
 */
