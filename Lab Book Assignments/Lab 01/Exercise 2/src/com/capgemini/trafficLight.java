package com.capgemini;

import java.util.*;

public class trafficLight {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter one of the following.\n1. Red\n2. Yellow\n3. Green");
		int num = sc.nextInt();
		switch(num) {
		case 1:
			System.out.println("Stop");
			break;
		case 2:
			System.out.println("Ready");
			break;
		case 3:
			System.out.println("Go");
			break;
		default:
			System.out.println("Invalid input");
			break;
		}

		sc.close();
	}
}
