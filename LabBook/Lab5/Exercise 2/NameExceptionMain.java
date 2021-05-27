package lab5;

import java.util.Scanner;

public class NameExceptionMain {
	
	public static void validateName(String name) throws NameException {
		String nm[]=name.split(" ");
		if(nm[0].length()==0)
			throw new NameException("First Name cannot be blank.");
		else if(nm.length<2)
			throw new NameException("Last Name cannot be blank.");
		else
			System.out.println("Valid Name.");
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		try {
			System.out.print("Enter the name : ");
			String name=sc.nextLine();
			validateName(name);
		}
		catch(NameException e) {
			System.out.println("Error Message : "+e);
		}
		
		sc.close();
	}

}
