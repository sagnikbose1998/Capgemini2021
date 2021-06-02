package com.capgemini;

import java.util.*;

public class Solution {
    static HashMap<String, String> getStudents(HashMap<String, Integer> map) {
        HashMap<String, String> medal = new HashMap<>();
        Set<String> set = map.keySet();
        for (String s: set) {
            int marks = map.get(s);
            if (marks >= 90)
                medal.put(s, "Gold");
            else if (marks >= 80 && marks < 90)
                medal.put(s, "Silver");
            else if (marks >= 70 && marks < 80)
                medal.put(s, "Bronze");
            else
                medal.put(s, "No medal received!");
        }
        return medal;
    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("R001", 76);
        map.put("R002", 65);
        map.put("R003", 89);
        map.put("R004", 90);
        map.put("R005", 93);
        map.put("R006", 82);
        map.put("R007", 67);

        HashMap<String, String> ans = getStudents(map);
        for (Map.Entry entry: ans.entrySet())
            System.out.println(entry.getKey() + " : " + entry.getValue());
    }
}
