import java.util.*;
public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = sc.nextLine();
		System.out.print("Enter index to extract substring from: ");
		int n = sc.nextInt();
		
		String subStr = s.substring(n-1);
		String rev = "";
		for (int i = subStr.length()-1; i >= 0; i--)
			rev += subStr.charAt(i);
		if (subStr.equals(rev) == true)
			System.out.println("Palindrome");
		else
			System.out.println("Not palindrome");
		
		sc.close();
	}

}
