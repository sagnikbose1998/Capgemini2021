package lab5;

import java.util.Scanner;

public class AgeExceptionMain {

	public static void validateAge(int age) throws AgeException
	{
		if(age<=15)
			throw new AgeException("Age must be above 15 years.");
		else
			System.out.println("Valid Age.");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		try {
			System.out.print("Enter the age : ");
			int age=sc.nextInt();
			validateAge(age);
		}catch(AgeException e)
		{
			System.out.println("Error Message : "+e);
		}
		
		sc.close();

	}

}
