package lab2_assignment;

import java.util.*;

public class AlphabeticalSort {
	
	public static String[] sortStrings(String[] arr) {
		Arrays.sort(arr);
		int len = arr.length, i;
		String newArray[] = new String[len];
		for(i = 0; i<(int)Math.ceil(len/2)+1; i++)
			newArray[i] = arr[i].toUpperCase();
		for(i = (int)Math.ceil(len/2)+1; i<len; i++)
			newArray[i] = arr[i].toLowerCase();
		return newArray;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String entries[] = new String[num];
		Scanner sc2 = new Scanner(System.in);
		for(int i=0; i<num; i++)
			entries[i] = sc2.nextLine();
		System.out.println("The resultant array is: ");
		String[] sortArray = sortStrings(entries);
		for(String value : sortArray)
			System.out.println(value);
		sc.close();
		sc2.close();
		
	}
}
