package com.capgemini;

import java.util.*;

public class Solution {
    static HashMap<Character, Integer> countChars(char[] arr) {
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        for (char c: arr) {
            if (charCountMap.containsKey(c))
                charCountMap.put(c, charCountMap.get(c) + 1);
            else
                charCountMap.put(c, 1);
        }
        return charCountMap;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the char array: ");
        char[] arr = sc.next().toCharArray();
        HashMap<Character, Integer> ans = new HashMap<>();
        ans = countChars(arr);

        for (Map.Entry entry: ans.entrySet())
            System.out.println(entry.getKey() + " " + entry.getValue());
        sc.close();
    }
}
