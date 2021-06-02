package com.capgemini;

import java.util.*;
public class Solution {

	static int getSecondSmallest(int arr[]) {
		int temp;
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			for (int j = i+1; j < n; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr[1];
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		int ans = getSecondSmallest(arr);
		System.out.println(ans);
		sc.close();
	}

}
