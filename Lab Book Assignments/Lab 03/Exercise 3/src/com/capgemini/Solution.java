package com.capgemini;

import java.util.*;

public class Solution {
	static boolean isVowel(char ch) {
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
			return true;
		return false;
	}
	
	static String alterString(String st) {
		char s[]= st.toCharArray();
		for (int i = 0; i < s.length; i++) 
			if (!isVowel(s[i])) 
				s[i] = (char)(s[i] + 1);
		return String.valueOf(s);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = sc.next();
		System.out.println(alterString(st));
		sc.close();
	}
}
