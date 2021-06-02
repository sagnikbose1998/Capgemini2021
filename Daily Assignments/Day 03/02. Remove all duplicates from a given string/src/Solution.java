import java.util.*;
public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String s = sc.nextLine();
		char[] ch = s.toCharArray();
		String ans = "";
		for (char val: ch) {
			if (ans.indexOf(val) == -1) 
				ans += val;
		}
		System.out.println("After deleting: " + ans);
		
		sc.close();
	}

}
