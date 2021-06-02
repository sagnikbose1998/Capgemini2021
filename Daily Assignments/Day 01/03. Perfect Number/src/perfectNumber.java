import java.util.*;
public class perfectNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = n, s = 0;
		for (int i = 1; i <= (n/2); i++) 
			if (n % i == 0)
				s += i;
		if (s == n) 
			System.out.println("Perfect number");
		else
			System.out.println("Not perfect number");
				
		sc.close();
	}

}
