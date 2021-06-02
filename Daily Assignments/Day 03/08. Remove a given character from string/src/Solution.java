import java.util.*;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string without any special characters (spaces allowed): ");
		String s = sc.nextLine();
		System.out.print("Enter the character to be removed: ");
		char c = sc.next().charAt(0);
		
		s = s.replace(c, '@');
		String res = "";
		char[] ch = s.toCharArray();
		for (char x: ch) {
			if (x != '@')
				res += x;
		}
		System.out.println("After removing: " + res);
		sc.close();
	}

}
