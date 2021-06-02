/* Exercise 5: Create a method which accepts an array of integer elements 
 * and return the second smallest element in the array
 */

package lab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SecondSmallest {
	
	// method to return second smallest element in an array
	public static int getSecondSmallest(int[] array) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		for(int i=0;i<array.length;i++) {
			arrayList.add(array[i]);
		}
		Collections.sort(arrayList);
		int secondSmallest=arrayList.get(1);
		for(int i=1;i<array.length;i++) {
			if(arrayList.get(i)!=arrayList.get(i-1))
			{
				secondSmallest=arrayList.get(i);
				break;
			}
		}
		return secondSmallest;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sm=new Scanner(System.in);
		System.out.print("Enter the size of the array : ");
		int size=sm.nextInt();
		if(size<1)
			System.out.println("Cannot Proceed...Size should be 1 or more.");
		else {
			int array[]=new int[size];
			for(int i=0;i<size;i++) {
				System.out.print("Enter Element No."+(i+1)+" : ");
				array[i]=sm.nextInt();
			}
			System.out.println("The second smallest number in the array is "+getSecondSmallest(array)+".");
		}
		sm.close();
	}

}
