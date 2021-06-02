/* Exercise 2: Write a Java Program to validate the full name 
 * of an employee. Create and throw a user defined exception if firstName and lastName is blank.
 */

package lab5;

public class NameException extends Exception{
	
	public NameException(String msg) {
		super(msg);
	}

}
