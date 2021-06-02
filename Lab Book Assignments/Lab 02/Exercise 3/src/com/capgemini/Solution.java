package com.capgemini;

import java.util.*;
public class Solution {

	static int[] getSorted(int[] arr) {
		int len = arr.length;
		for (int i = 0; i < len; i++) {
			StringBuffer s = new StringBuffer(String.valueOf(arr[i]));
			s.reverse();
			arr[i] = Integer.parseInt(String.valueOf(s));
		}
		Arrays.sort(arr);
		return arr;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		int[] ans = getSorted(arr);
		System.out.println(Arrays.toString(ans));
		
		sc.close();
	}

}
