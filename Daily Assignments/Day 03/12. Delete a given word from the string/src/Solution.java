import java.util.*;
public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = sc.nextLine();
		System.out.print("Enter a word to delete: ");
		String word = sc.nextLine();
		
		if (s.contains(word))
			s = s.replace(word, "");
		System.out.println("After deleting: " + s);
		
		sc.close();
	}

}
