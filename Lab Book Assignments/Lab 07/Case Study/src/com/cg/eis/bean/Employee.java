package com.cg.eis.bean;

public class Employee {
    private int employeeID;
    private String employeeName;
    private double salary;
    private String employeeDesignation;
    private String insuranceScheme;

//    Constructors
    public Employee(int id, String name, double sal, String desg, String scheme) {
        super();
        this.employeeID = id;
        this.employeeName = name;
        this.salary = sal;
        this.employeeDesignation = desg;
        this.insuranceScheme = scheme;
    }
    public Employee() { super(); }

//    Getters
    public int getEmployeeID() { return employeeID; }
    public String getEmployeeName() { return employeeName; }
    public double getSalary() { return salary; }
    public String getEmployeeDesignation() { return employeeDesignation; }
    public String getInsuranceScheme() { return insuranceScheme; }

//    Setters
    public void setEmployeeID(int id) { this.employeeID = id; }
    public void setEmployeeName(String name) { this.employeeName = name; }
    public void setSalary(double sal) { this.salary = sal; }
    public void setEmployeeDesignation(String desg) { this.employeeDesignation = desg; }
    public void setInsuranceScheme(String scheme) { this.insuranceScheme = scheme; }

//    toString
    @Override
    public String toString() {
        return "Employee ID: " + employeeID + "\nEmployee Name: " + employeeName + "\nSalary: " + salary + "\nDesignation: " + employeeDesignation + "\nInsurance Scheme: " + insuranceScheme;
    }
}
