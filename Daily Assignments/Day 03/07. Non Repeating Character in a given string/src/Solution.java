import java.util.*;
public class Solution {
	
	static int freqCt(String s, char c) {
		int ct = 0;
		char[] ch = s.toCharArray();
		for (char i: ch)
			if (i == c)
				ct += 1;
		return ct;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String s = sc.nextLine();
		
		char[] ch = s.toCharArray();
		String res = "";
		for (char c: ch) 
			if (freqCt(s, c) == 1) 
				res += c;
		System.out.println("The non-repeating characters are: " + res);
		
		sc.close();
	}

}
