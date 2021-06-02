import java.util.*;
public class Solution {
	
	static int[] getCharArr(String s) {
		int[] ct = new int[256];
		for (int i = 0; i < s.length(); i++)
			ct[s.charAt(i)]++;
		return ct;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first string: ");
		String s1 = sc.nextLine();
		System.out.print("Enter the second string: ");
		String s2 = sc.nextLine();
		
		int ct[] = getCharArr(s2);
		int ip = 0, res = 0;
		char arr[] = s1.toCharArray();
		while (ip != arr.length) {
			char temp = arr[ip];
			if (ct[temp] == 0) {
				arr[res] = arr[ip];
				res += 1;
			}
			ip += 1;
		}
		s1 = new String(arr);
		System.out.println("After removal: " + s1.substring(0, res));
		
		sc.close();
	}

}
