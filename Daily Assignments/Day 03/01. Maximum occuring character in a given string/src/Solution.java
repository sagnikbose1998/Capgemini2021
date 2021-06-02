import java.util.*;
public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = sc.nextLine();
		int ct[] = new int[256];
		int len = s.length();
		for (int i = 0; i < len; i++) 
			ct[s.charAt(i)] += 1;
		int max = -1;
		char res = ' ';
		
		for (int i = 0; i < len; i++) {
			if (max < ct[s.charAt(i)]) {
				max = ct[s.charAt(i)];
				res = s.charAt(i);
			}
		}
		System.out.println("Max: " + res);
		
		sc.close();
	}

}
