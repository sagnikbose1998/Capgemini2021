package com.capgemini;

import java.util.*;
public class sumOfCubes {

	public static int sumOfCubes(int number) {
		int sum = 0;
		int rem = 0;
		while (number != 0) {
			rem = number%10;
			sum += rem*rem*rem;
			number /= 10;
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		System.out.println(sumOfCubes(n));
		
		sc.close();
	}

}
