package com.capgemini;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    static int[] getSorted(int[] arr) {

//        Convert to string to reverse and then back to int
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            StringBuilder s = new StringBuilder(String.valueOf(arr[i]));
            s.reverse();
            arr[i] = Integer.parseInt(String.valueOf(s));
        }

//        Convert arr to array list to use Collections sort
        ArrayList<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toCollection(ArrayList::new));
        Collections.sort(list);

//        Converting back to int arr and return
        int[] ret = new int[list.size()];
        for (int i = 0; i < ret.length; i++)
            ret[i] = list.get(i);
        return ret;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int n = sc.nextInt();
        System.out.print("Enter the array elements: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.println(Arrays.toString(getSorted(arr)));
        sc.close();
    }
}
