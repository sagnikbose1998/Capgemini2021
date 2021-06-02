import java.util.*;
public class Solution {
	
	static boolean anagramCheck(String s1, String s2) {
		char str1[] = s1.toLowerCase().toCharArray();
		char str2[] = s2.toLowerCase().toCharArray();
		int n1 = str1.length;
		int n2 = str2.length;
		
		if (n1 != n2)
			return false;
		Arrays.sort(str1);
		Arrays.sort(str2);
		
		for (int i = 0; i < n1; i++) {
			if (str1[i] != str2[i]) 
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first string: ");
		String s1 = sc.nextLine();
		System.out.print("Enter the second string: ");
		String s2 = sc.nextLine();
		
		if (anagramCheck(s1, s2) == true) 
			System.out.println("Both are anagrams.");
		else
			System.out.println("Both are not anagrams.");
		sc.close();
	}

}
