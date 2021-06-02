import java.util.*;
public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = sc.nextLine();
		
		String[] words = s.split(" ");
		System.out.println("The repeated words are: ");
		for (int i = 0; i < words.length; i++) {
			for (int j = i+1; j < words.length; j++) {
				if (words[i].equalsIgnoreCase(words[j])) {
					System.out.println(words[j] + " ");
					break;
				}
			}
		}
		
		sc.close();
	}

}
