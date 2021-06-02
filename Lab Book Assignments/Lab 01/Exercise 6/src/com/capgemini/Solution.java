package com.capgemini;

import java.util.*;
public class Solution {

	public static int calculateDifference(int n) {
		int ans = 0;
		int sumSq = 0, sqSum = 0, sum = 0;
		for (int i = 1; i <= n; i++) {
			sqSum += i*i;
			sum += i;
		}
		sumSq = (sum*sum);
		ans = Math.abs(sumSq - sqSum);
		
		return ans;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int ans = calculateDifference(n);
		System.out.println(ans);
		
		sc.close();
	}

}
