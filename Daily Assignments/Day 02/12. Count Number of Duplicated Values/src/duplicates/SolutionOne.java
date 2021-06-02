package duplicates;
import java.util.*;
public class SolutionOne {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter array length: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.print("Enter the array elements: ");
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		System.out.print("Duplicate elements in given array: ");
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] == arr[j])
					System.out.println(arr[j]);
			}
		}

		sc.close();
	}

}


