package comiq.classes;

/**
 *Simple CLI menu class
 *@author Jari-Pekka Kankaanpää
 *@version 1.0
 */  

public class Menu{

    private comiq.classes.interfaces.Game game;

    /**
     *Method for printing menu options
     */
    private void printMenu(){
	System.out.println("1. Arvaa summa");
	System.out.println("2. Lopeta");
    }

    public Menu(){
	this.game = new Guess(2);
    }

    /**
     *Method for menu handling
     *@return Boolean value, true for terminating menu, false to continue
     */
    public boolean useMenu(){

        printMenu();
	int input = ValueReader.readInt();

	switch (input)
	{
	case 1:
	    this.game.run();
	    return false;
	case 2:
	    return true;
	default:
	    System.out.println("Ei ole vaihtoehto!");
	    return false;
	}
		
    }

    public void run(){

	while(!this.useMenu())
	    System.out.println();
    }
	
}

