import java.util.*;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array length: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.print("Enter the array elements: ");
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		for (int i = 0; i < n / 2; i++) {
			arr[i] = arr[i] + arr[n - i - 1];
			arr[n - i - 1] = arr[i] - arr[n - i - 1];
			arr[i] = arr[i] - arr[n - i - 1];
		}
		System.out.print("Array in Reverse Form: " + Arrays.toString(arr));
		sc.close();
	}

}
