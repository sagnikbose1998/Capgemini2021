package com.capgemini;

import java.util.*;

public class Solution {
    static List<String> votersList(HashMap<String, Integer> voters) {
        List<String> list = new ArrayList<String>();
        for (Map.Entry ent: voters.entrySet()) {
            String id = (String)ent.getKey();
            int age = (int)ent.getValue();
            if (age >= 18)
                list.add(id);
        }
        return list;
    }

    public static void main(String[] args) {
        HashMap<String, Integer> voters = new HashMap<>();
        voters.put("001", 18);
        voters.put("002", 29);
        voters.put("003", 14);
        voters.put("004", 76);
        voters.put("005", 45);
        voters.put("006", 54);
        voters.put("007", 23);

        List<String> ans = votersList(voters);
        for (String an : ans) System.out.println(an);
    }
}
