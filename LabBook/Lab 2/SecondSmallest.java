package lab2_assignment;

import java.util.*;

public class SecondSmallest {

	public static int getsecondSmallest(int[] array) {
		Arrays.sort(array);
		return array[1];
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if (num <= 1)
			System.out.println("Invalid Input");
		else {
			int[] a = new int[num];
			for (int i=0; i<num; i++)
				a[i] = sc.nextInt();
			System.out.println("Second smallest element is: " + getsecondSmallest(a));
		}
		sc.close();
	}

}