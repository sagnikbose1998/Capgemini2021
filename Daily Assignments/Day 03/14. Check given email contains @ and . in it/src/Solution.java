import java.util.*;
public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the email: ");
		String email = sc.nextLine();
		
		if (email.contains("@") && email.contains("."))
			System.out.println("Email contains both @ and .");
		else if (email.contains("@") && !email.contains("."))
			System.out.println("Email contains only @");
		else if (email.contains(".") && !email.contains("@"))
			System.out.println("Email only contains .");
		else 
			System.out.println("Email doesn't contain either of @ or .");
		
		sc.close();
	}

}
