import java.util.*;
public class strongNumber {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int s = 0, d = 0, temp = n, fact = 0;
		while (n > 0) {
			d = n % 10;
			fact = 1;
			for (int i = 1; i <= d; i++) 
				fact *= i;
			s += fact;
			n /= 10;
		}
		if (s == temp)
			System.out.println("Yes");
		else
			System.out.println("No");
		
		sc.close();
	}
}
