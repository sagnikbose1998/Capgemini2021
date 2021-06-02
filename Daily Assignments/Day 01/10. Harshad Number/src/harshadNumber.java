import java.util.*;
public class harshadNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int rem = 0, sum = 0, temp = n;
		while (n > 0) {
			rem = n % 10;
			sum += rem;
			n /= 10;
		}
		if (temp%sum == 0)
			System.out.println("Harshad Number");
		else
			System.out.println("Not a Harshad Number");
		
		sc.close();
	}
}
