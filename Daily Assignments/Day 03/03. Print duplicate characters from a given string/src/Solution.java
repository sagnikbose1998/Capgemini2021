import java.util.*;
public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String s = sc.nextLine();
		System.out.println("The duplicates are: ");
		for (int i = 0; i < s.length(); i++) {
			for (int j = i+1; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {
					System.out.println(s.charAt(j));
					break;
				}
			}
		}
		sc.close();
	}

}
