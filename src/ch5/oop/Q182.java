package ch5.oop;

import java.util.ArrayList;
import java.util.List;

class Player{
}

interface Playable{
    public void play();
    public void setPlayers(List<Player> players);
}

class Game implements Playable{
    private List<Player> players;
    public List <Player> getPlayers(){
        return players;
    }
    public void setPlayers(List<Player> players){
        this.players = players;
    }
    public void play(){
        System.out.println("Played.");
    }
}
public class Q182{
    public static void main(String[] args) {
        Playable p = new Game();
        List<Player> players = new ArrayList<>();
        p.setPlayers(players);
        p.play();
    }
}

/*

Which statement is true about the implementation of Object-Oriented Programming concepts in the given code?
A. Polymorphism, abstraction, and encapsulation are implemented.		
B. Only polymorphism and inheritance are implemented.
C. Polymorphism, inheritance, and abstraction are implemented.
D. Only inheritance and encapsulation are implemented.

my option. Polymorphism, inheritance, abstraction, and encapsulation are implemented.
* */

/**
 encapsulation: private variable, setter-getter  --> private List<Player> players;
 inheritance: extending and implementing are related with inheritance , subclass-superclass -- > Game implements Playable
 Polymorphism: object casting, multiple form -->  Playable p = new Game();
 Abstraction: hiding the implementation details and showing only functionality to the user. 
 	--> interface Playable, has two abstract methods and they have not details  
 */ 
