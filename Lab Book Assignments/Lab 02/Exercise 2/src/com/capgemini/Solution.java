package com.capgemini;

import java.util.*;
public class Solution {

	static String[] sortStrings(String[] arr) {
		Arrays.sort(arr);
		int len = arr.length;
		String[] newArr = new String[len];
		for (int i = 0; i < (int)Math.ceil(len/2)+1; i++)
			newArr[i] = arr[i].toUpperCase();
		for (int i = (int)Math.ceil(len/2)+1; i < len; i++)
			newArr[i] = arr[i].toLowerCase();
		return newArr;
	}
	
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		int num = sc1.nextInt();
		String entries[] = new String[num];
		for(int i=0; i<num; i++)
			entries[i] = sc2.nextLine();
		System.out.println("The resultant array is: ");
		String[] sortArray = sortStrings(entries);
		for(String value : sortArray)
			System.out.println(value);
		
		sc1.close();
		sc2.close();
		
	}

}
