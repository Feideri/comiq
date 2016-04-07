package comiq.classes;


/**
 *Simple class for simulating a dice. 
 *Can be extended to simulate dices with any number of sides
 *with different starting values.
 *@author Jari-Pekka Kankaanpää
 *@version 1.0
 */ 

public class Dice{

    private int value;
    private final int MIN;
    private final int MAX;

     /**
     * Constructs six-sided dice by default
     */
    public Dice(){

	this.MIN = 1;
	this.MAX = 6;
    }

    /**
     * Can be used to construct different kinds of dice
     * @param Integer for minimum value of the dice
     * @param Integer value for the amount of sides in the dice
     */
    public Dice(int min, int max){

	this.MIN = min;
	this.MAX = max;	
    }
    
    /**
     * Generates random value for the dice
     */
    public void diceThrow(){
	this.value = (int)(Math.random() * this.MAX + this.MIN);
    }

    /**
     * Returns the value of the dice
     * @return Integer value of the dice
     */
    public int showValue(){
	return this.value;
    }

    /**
     * Returns the minimum value of the dice
     * @return Integer value of the dice
     */
    public int retMin(){
	return this.MIN;
    }

    /**
     * Returns the amount of sides in the dice
     * @return Integer value of the dice
     */
    public int retMax(){
	return this.MAX;
    }
    
}
