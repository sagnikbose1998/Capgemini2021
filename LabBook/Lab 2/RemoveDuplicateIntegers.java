package lab2_assignment;

import java.util.*;

public class RemoveDuplicateIntegers {
		
	static int arrSize = 0;
		
	public static int[] modifyArray(int[] arr) {
		int[] resultArray = new int[arrSize];
		int k = 0;
		for(int i=0; i<arrSize; i++) {
			boolean flag = true;
			for(int j = 0; j<resultArray.length; j++) {
				if(arr[i] != resultArray[j])
					continue;
				else {
					flag = false;
					break;
				}
			}
			if(flag)
				resultArray[k++] = arr[i];
		}
		Arrays.sort(resultArray);
		for(int i=0; i<resultArray.length / 2; i++) {
			int temp = resultArray[i];
			resultArray[i] = resultArray[resultArray.length-i-1];
			resultArray[resultArray.length-i-1] = temp;
		}
		return resultArray;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		arrSize = sc.nextInt();	
		int[] array = new int[arrSize];
		for(int i=0; i<arrSize; i++)
				array[i] = sc.nextInt();
		int[] sortedArray = modifyArray(array);	
		for(int val : sortedArray) {
			if(val != 0)
				System.out.println(val);
		}	
		sc.close();
	}

}