package com.capgemini;

import java.util.*;

public class primePrint {

	static boolean isPrime(int number) {
		if (number <= 1)
			return false;
		for (int i = 2; i < number; i++)
			if (number%i == 0)
				return false;
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to print prime numbers upto: ");
		int number = sc.nextInt();
		for (int i = 2; i <= number; i++) {
			if (isPrime(i)) 
				System.out.println(i);
		}
		sc.close();
	}

}
