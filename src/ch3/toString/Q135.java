package ch3.toString;


class Planet {
	public String name;
	public int moons;
	
	public Planet(String name, int moons) {
		this.name = name;
		this.moons = moons;
	}
	
}

public class Q135 {
		public static void main(String[] args) {
			Planet[] planets = {
					new Planet ("Mercury", 0),
					new Planet ("Venus", 0),
					new Planet ("Earth", 1),
					new Planet ("Mars", 2),
							
			};
			
			System.out.println(planets);
			System.out.println(planets[2].name);
		    System.out.println(planets[2].moons);

		}
	}

/* 135 What is the output? 
 * 
A) planets
	Earth
	1

B) [LPlanets.Planet;@15db9742		>>OK
	Earth
	1

C) [LPlanets.Planet;@15db9742
	Planets.Planet@6d06d69c
	1
	
D) [LPlanets.Planet;@15db9742
   Planets.Planet@6d06d69c
   [LPlanets.Moon;@7852e922
   
E) [LPlanets.Planet;@15db9742
   Venus
 	0
*/

/** NOTES
 L means it is an array, Planets.Planet is the reference type, and 15db9742 is the hash code.
 You should also know that ArrayList implements toString() so you can easily see the contents just by printing it. 
 Arrays do not do produce such pretty output.
 

 !! attention to printing the object or field of object 
 
//override the toString method to print object informations
public String toString(){  
	return name+moons;
}
 
 * what is the output in this case? 
 System.out.println(planets[2]);
 
 */



