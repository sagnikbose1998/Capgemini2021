import java.util.*;
public class abundantPerfect {
	public static void main(String[] args) {
		for (int i = 1; i < 10000; i++) {
			if (i == 1) {
				System.out.println("1 is neither Perfect, Abundant or Deficient Number");
				continue;
			}
			int num = i, sum = 0;
			for (int j = 1; j < num/2; j++) {
				if (num%j == 0) {
					sum += j;
				}
				if (sum == num)
					System.out.printf("%d is a Perfect number\n", i);
				if (sum < num)
					System.out.printf("%d is a Deficient number\n", i);
				if (sum > num)
					System.out.printf("%d is an Abundant number\n", i);
			}
		}
	}
}
