package com.cg.eis.pl;
import com.cg.eis.service.EmployeeServiceClass;

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        EmployeeServiceClass emp1 = new EmployeeServiceClass();
        emp1.getDetails();
        emp1.insuranceScheme();
        emp1.empDetails();

        sc1.close();
        sc2.close();
    }
}
