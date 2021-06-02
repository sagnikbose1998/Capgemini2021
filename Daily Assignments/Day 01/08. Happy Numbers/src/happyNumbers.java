
public class happyNumbers {

	public static int isHappy(int n) {
		int rem = 0, sum = 0;
		while (n > 0) {
			rem = n % 10;
			sum += (rem*rem);
			n /= 10;
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println("First 10 Happy Numbers include: ");
		for (int i = 1; i <= 10; i++) {
			int res = i;
			while (res != 1 && res != 4) 
				res = isHappy(res);
			if (res == 1)
				System.out.println(i);
		}

	}

}
