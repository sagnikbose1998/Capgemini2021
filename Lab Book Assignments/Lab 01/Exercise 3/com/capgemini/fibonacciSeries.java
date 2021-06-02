package com.capgemini;

import java.util.Scanner;

public class fibonacciSeries {

	public static int recurFib(int number) {
		if (number <= 1)
			return number;
		return recurFib(number-1) + recurFib(number-2);
	}
	
	public static int iterFib(int number) {
		if (number <= 1)
			return number;
		else {
			int a = 0, b = 1;
			for (int i = 1; i < number; i++) {
				int temp = a;
				a = b;
				b = temp+a;
			}
			return b;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter which Fibonacci number to find: ");
		int num = sc.nextInt();
		System.out.println("The " + num + "th value by recursion is " + recurFib(num));
		System.out.println("The " + num + "th value by iteration is " + iterFib(num));
		sc.close();
	}

}
