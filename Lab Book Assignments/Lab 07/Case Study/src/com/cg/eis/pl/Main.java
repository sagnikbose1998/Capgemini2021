package com.cg.eis.pl;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeServiceImplementation;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        EmployeeServiceImplementation employeeService = new EmployeeServiceImplementation();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Add Employee\n2. Show Insurance Scheme\n3. Show Employee details\n4. Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter Employee ID: ");
                    int empId = sc.nextInt();
                    System.out.print("Enter Employee Name: ");
                    String empName = sc.nextLine();
//                    Buffer clear
                    sc.nextLine();
                    System.out.print("Enter Employee Salary: ");
                    double sal = sc.nextDouble();
//                    Buffer clear
                    sc.nextLine();
                    System.out.print("Enter Employee Designation: ");
                    String empDesg = sc.nextLine();

                    String scheme = employeeService.findInsuranceScheme(sal, empDesg);
                    Employee emp = new Employee(empId, empName, sal, empDesg, scheme);
                    employeeService.addEmployee(emp);
                    break;
                case 2:
                    System.out.print("Enter Employee ID: ");
                    empId = sc.nextInt();
                    emp = employeeService.showEmployee(empId);
                    if (emp != null)
                        System.out.println(emp.getInsuranceScheme());
                    break;
                case 3:
                    System.out.print("Enter Employee ID: ");
                    empId = sc.nextInt();
                    emp = employeeService.showEmployee(empId);
                    if (emp != null)
                        System.out.println(emp);
                    break;
                default:
                    System.out.println("Wrong input!");
                    break;
            }
        } while(choice != 4);
        sc.close();
    }
}
