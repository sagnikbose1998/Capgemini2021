package com.capgemini;

import java.util.*;
public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringTokenizer st = new StringTokenizer(sc.nextLine(), " ");
		int sum = 0;
		while (st.hasMoreTokens()) {
			int x = 0;
			x = Integer.parseInt(st.nextToken());
			System.out.print(x + " ");
			sum += x;
			
		}
		System.out.print("\n" + sum);
		sc.close();
	}

}
