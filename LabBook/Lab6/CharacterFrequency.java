/* Exercise2 Collection: Create a method that accepts a character array and 
 * count the number of times each character is present in the array
 */

package lab6;

import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

public class CharacterFrequency {
	
	// method to count frequency of a character in an array
	public static int countfreq(char[] arr,char k) {
		int counter=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==k)
				counter++;
		}
		return counter;
	}
	
	// method to count frequency of a character in an array and return in the form of a map
	public static Map<Character,Integer> countChars(char[] arr){
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]!=arr[j]) {
					map.put(arr[i],countfreq(arr, arr[i]));
				}
			}
			map.put(arr[arr.length-1],countfreq(arr,arr[arr.length-1]));
		}
		return map;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sm=new Scanner(System.in);
		System.out.print("Enter size of the character array : ");
		int size=sm.nextInt();
		if(size<1)
			System.out.println("Cannot Proceed...Size should be 1 or more.");
		else {
		char arr[]=new char[size];
		for(int i=0;i<size;i++) {
			System.out.print("Enter Character No."+(i+1)+" : ");
			arr[i]=sm.next().charAt(0);
		}
		Map<Character,Integer> map=countChars(arr);
		System.out.println("The number of times each character appears in the array is given below : ");
		for(Map.Entry<Character, Integer> m : map.entrySet()) {
			System.out.println("Character : "+m.getKey()+", Frequency : "+m.getValue());
		}
		}
		sm.close();

	}

}
