/* Exercise 1:  Validate the age of a person and display 
 * proper message by using user defined exception. Age of a person should be above 15.
 *///

package lab5;

public class AgeException extends Exception{
	
	public AgeException(String msg) {
		super(msg);
	}

}
