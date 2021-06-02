package com.cg.eis.service;

import com.cg.eis.bean.Employee;

import java.util.Scanner;
interface EmployeeService {
    void getDetails();
    void insuranceScheme();
    void empDetails();
}

public class EmployeeServiceClass extends Employee implements EmployeeService {
    Employee e1 = new Employee();

    public void getDetails() {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.print("Enter the Employee id: ");
        e1.id = sc1.nextInt();
        System.out.print("Enter the Employee name: ");
        e1.name = sc2.nextLine();
        System.out.print("Enter the Employee salary: ");
        e1.salary = sc1.nextInt();
        System.out.print("Enter the Employee designation: ");
        e1.designation = sc2.nextLine();
        System.out.print("Enter the Insurance Scheme: ");
        e1.insuranceScheme = sc2.nextLine();

        sc1.close();
        sc2.close();
    }

    public void insuranceScheme() {
        System.out.println("Some task to be done. Insufficient instructions");
    }

    public void empDetails() {
        System.out.println("Employee id: " + e1.id);
        System.out.println("Employee name: " + e1.name);
        System.out.println("Employee salary: " + e1.salary);
        System.out.println("Employee designation: " + e1.designation);
        System.out.println("Employee insurance scheme: " + e1.insuranceScheme);
    }
}
