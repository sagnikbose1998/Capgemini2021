package com.capgemini;

import java.util.*;

public class Solution {
    static ArrayList<Integer> getValues(HashMap<String, Integer> map) {
        List<Map.Entry<String, Integer>> list = new LinkedList<>(map.entrySet());
        Collections.sort(list, Comparator.comparing(Map.Entry::getValue));
        HashMap<String, Integer> temp = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> aa: list)
            temp.put(aa.getKey(), aa.getValue());
        ArrayList<Integer> ans = new ArrayList<>(temp.values());
        return ans;
    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

//        Data entry
        map.put("English", 98);
        map.put("Maths", 94);
        map.put("Science", 99);
        map.put("Social Studies", 90);
        map.put("Local Language", 89);

        System.out.println("Before sorting: \n");
        for (Map.Entry<String, Integer> e: map.entrySet())
            System.out.println("Key: " + e.getKey() + ", Value: " + e.getValue());

//        Printing
        System.out.println("\nAfter sorting: \n");
        System.out.println(getValues(map));
    }
}
