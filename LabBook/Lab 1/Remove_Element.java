package CoreJava8_LabExercise;

import java.util.Scanner;

public class Remove_Element {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array length::");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the array elements::");
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
		System.out.println("Enter the index from which element is to be deleted::");
		int d=sc.nextInt();
		
		if(d>n || d<0)
		{
			System.out.println("Wrong index provided!!");
			System.exit(0);
		}
		
		for (int i = d; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
		
		System.out.println("Array after deletion::");
		for(int i=0;i<n-1;i++)
			System.out.println(arr[i]+" ");
		sc.close();
	}
}
