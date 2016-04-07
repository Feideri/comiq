package comiq.classes;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *Utility class for reading values, handles only integers at the moment.
 *Can be easily extended further for other datatypes.
 *
 *@author Jari-Pekka Kankaanpää
 *@version 1.0
 */  

public class ValueReader{
    
    static BufferedReader stdin = new BufferedReader (new InputStreamReader (System.in));

    /**
     *Static method for reading integers
     *@return Integer value from input
     */
    
    public static int readInt(){
    int val = -1;
    boolean ok;
	
    do{
	try{
	    val = Integer.parseInt (stdin.readLine ());
	    ok = true;
	}
	catch (Exception e){
	    System.out.println ("Väärän tyyppinen arvo. Anna uusi!");
	    ok = false;
	}
    }
    while (!ok);
    return val;
  }
    
}
