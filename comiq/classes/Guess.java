package comiq.classes;
import comiq.classes.interfaces.*;

/**
 * Class for a game where you guess dice sums.
 * Can be used for limited variety of games.
 *
 * @author Jari-Pekka Kankaanpää
 * @version 1.0
 */


public class Guess implements Game{

    private Dice dice; 
    private int numberOfDices;
    private final int MIN;
    private final int MAX;

    /**
     *Constructs a default game with one six-sided dice
     */
    public Guess(){
	this.dice = new Dice();
	this.numberOfDices = 1;
	this.MIN = this.numberOfDices * this.dice.retMin();
	this.MAX = this.numberOfDices * this.dice.retMax();
    }


    /**
     *Constructs a game with any number of six-sided dice
     * @param Integer for the amount of dices to play with.
     */
    public Guess(int amount){
	this.dice = new Dice();
	this.numberOfDices = amount;
	this.MIN = this.numberOfDices * this.dice.retMin();
	this.MAX = this.numberOfDices * this.dice.retMax();
    }


    /**
     *Method for running the game
     */
    @Override
    public void run(){

	int guess = 0; //Input variable for guesses
	System.out.println("Pelissä on " + this.numberOfDices + " noppaa. Arvaa summa väliltä: "
			   + this.MIN + "-" + this.MAX + ".");
	guess = ValueReader.readInt();

	//Queries for new guess until the guess is inside the bounds
	while(guess < this.MIN || guess > this.MAX){
	    System.out.println("Lukujen summan on oltava väliltä " + this.MIN + "-" + this.MAX + "!"
		+" Syötä uusi arvaus:");
	    guess = ValueReader.readInt();
	}

	int diceSum = 0;

	//sums up the dice throws for the amount of dices
	for(int i = 0; i < this.numberOfDices; i++){
	    dice.diceThrow();
	    diceSum += dice.showValue();
	}

	System.out.println("Silmälukujen summa oli " + diceSum);

	if(guess == diceSum)
	    System.out.println("Arvasit oikein!");
	else
	    System.out.println("Arvasit väärin!");

    }
 
}
