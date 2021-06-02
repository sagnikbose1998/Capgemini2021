package com.capgemini;

import java.util.*;
public class Solution {
	static boolean checkNumber(int number) {
		if (number < 0)
			number = -number;
		int last = 10;
		int curr;
		
		while (number > 0) {
			curr = number%10;
			if (last < curr)
				return false;
			last = curr;
			number /= 10;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to check increasing or not: ");
		int n = sc.nextInt();
		boolean ans = checkNumber(n);
		if (ans == true)
			System.out.println(n + " is an increasing number");
		else
			System.out.println(n + " is not an increasing number");
		sc.close();
	}
}
