import java.util.*;
public class duplicateDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int freq[] = new int[10];
		int k = 0, flag = 0;
		for (int i = 0; i < 10; i++) 
			freq[i] = 0;
		while (n > 0) {
			k = n % 10;
			freq[k] += 1;
			n /= 10;
		}
		for (int i = 0; i < 10; i++) {
			if (freq[i] > 1) {
				flag = 1;
				System.out.printf("%d was repeated %d times.\n", i, freq[i]);
			}
		}
		if (flag == 0) {
			System.out.println("No repeated digits");
		}
		
		sc.close();
	} 
}
