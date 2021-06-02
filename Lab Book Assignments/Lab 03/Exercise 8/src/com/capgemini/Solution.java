package com.capgemini;

import java.util.*;
public class Solution {

	static boolean isPositive(String str) {
		int n = str.length();
		char c[] = new char[n];
		for (int i = 0; i < n; i++) 
			c[i] = str.charAt(i);
		Arrays.sort(c);
		for (int i = 0; i < n; i++) 
			if (c[i] != str.charAt(i))
				return false;
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		if (isPositive(st))
			System.out.println("Is positive string");
		else
			System.out.println("Is not positive string");;
		sc.close();
	}

}
