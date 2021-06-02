import java.util.*;
public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = sc.nextLine();
		
		s = s.toLowerCase();
		try {
			System.out.print("Enter the index: ");
			int n = sc.nextInt();
			if (s.charAt(n-1) >= 97 && s.charAt(n-1) <= 122)
				System.out.println("Index " + n + " contains an alphabet");
			else if (s.charAt(n-1) >= 48 && s.charAt(n-1) <= 57)
				System.out.println("Index " + n + " contains a digit");
			else
				System.out.println("Index " + n + " contains a symbol");
		}
		catch (IndexOutOfBoundsException e) { System.out.println("Index out of Bounds!"); }
		
		sc.close();
	}

}
