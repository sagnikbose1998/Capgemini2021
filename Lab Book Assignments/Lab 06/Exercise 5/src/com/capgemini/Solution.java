package com.capgemini;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    static int getSecondSmallest(int[] arr) {
//        Convert to arrayList
        ArrayList<Integer> arrList = Arrays.stream(arr).boxed().collect(Collectors.toCollection(ArrayList::new));
//        Sorting
        Collections.sort(arrList);
//        Return the second smallest element
        return arrList.get(1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the array elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.println("Second smallest element: " + getSecondSmallest(arr));
        sc.close();
    }
}
