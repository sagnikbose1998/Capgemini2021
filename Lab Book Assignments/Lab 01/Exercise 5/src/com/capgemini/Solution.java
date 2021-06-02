package com.capgemini;

import java.util.*;
public class Solution {

	public static int calculateSum(int n) {
		int s = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0 || i % 5 == 0)
				s += i;
		}
		return s;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int ans = calculateSum(n);
		System.out.println(ans);
		sc.close();
	}

}
