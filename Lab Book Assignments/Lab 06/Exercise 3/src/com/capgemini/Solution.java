package com.capgemini;

import java.util.*;
public class Solution {
    static HashMap<Integer, Integer> getSquares(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n: arr)
            map.put(n, n*n);
        return map;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n = sc.nextInt();
        System.out.print("Enter the array: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        HashMap<Integer, Integer> ans = getSquares(arr);
        for (Map.Entry entry: ans.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        sc.close();
    }
}
