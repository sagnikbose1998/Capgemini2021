package com.capgemini;

import java.util.*;
public class Solution {

	static boolean checkNumber(int n) {
		return (n & n-1) == 0;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to check if power of two or not ");
		int n = sc.nextInt();
		boolean ans = checkNumber(n);
		if (ans == true)
			System.out.println(n + " is a power of 2");
		else
			System.out.println(n + " is not a power of 2");
		
		sc.close();
	}

}
