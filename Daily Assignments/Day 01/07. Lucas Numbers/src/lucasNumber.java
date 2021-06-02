
public class lucasNumber {

	public static void main(String[] args) {
		int f = 2, s = 1;
		int next = 0, i = 0;
		System.out.printf("The first 10 Lucas numbers are: %d %d", f, s);
		while (i <= 7) {
			next = f + s;
			System.out.printf(" %d", next);
			f = s;
			s = next;
			i += 1;
		}

	}

}
