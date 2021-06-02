import java.util.*;
public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String s = sc.nextLine();
		
		String ans = "";
		for (int i = 0; i < s.length(); i++)
			if (s.charAt(i) >= 65 && s.charAt(i) <= 90)
				ans += s.charAt(i);
		
		for (int i= 0; i < s.length(); i++)
			if (!(s.charAt(i) >= 65 && s.charAt(i) <= 90))
				ans  += s.charAt(i);
		
		System.out.println("Output string: " + ans);
		
		sc.close();
	}

}
