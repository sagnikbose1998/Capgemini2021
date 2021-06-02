import java.util.*;
public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String s = sc.nextLine();
		
		String[] word = s.split(" ");
		System.out.println("Number of words are: " + word.length);
		
		sc.close();
	}

}
