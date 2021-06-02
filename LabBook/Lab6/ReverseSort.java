/* Exercise 7: Create a method which accepts an integer array, 
 * reverse the numbers in the array and returns the resulting array in sorted order
 */

package lab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ReverseSort {
	
	// method to reverse a string
	public static int reverse(int number) {
		String string=""+number;
		String rev="";
		for(int i=string.length()-1;i>=0;i--) {
			rev+=string.charAt(i);
		}
		return Integer.parseInt(rev);
	}
	
	// method to reverse each elements of an array and sort and return the array
	public static int[] getSorted(int[] array) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		for(int i=0;i<array.length;i++) {
			array[i]=reverse(array[i]);
			arrayList.add(array[i]);
		}
		Collections.sort(arrayList);
		for(int i=0;i<array.length;i++) {
			array[i]=arrayList.get(i);
		}
		return array;
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
			System.out.println("The reversed elements before sorting the array : ");
			for(int i=0;i<size;i++) {
				System.out.print(reverse(array[i])+" ");
			}
			System.out.println();
			System.out.println("The reversed elements after sorting the array : ");
			array=getSorted(array);
			for(int i=0;i<size;i++) {
				System.out.print(array[i]+" ");
			}
		}
		
		sm.close();
	}

}
