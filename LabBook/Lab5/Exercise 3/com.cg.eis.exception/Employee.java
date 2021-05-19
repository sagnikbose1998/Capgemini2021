package com.cg.eis.exception;

public class Employee {
	
	private int empID;
	private String empName;
	private int age;
	private double salary;
	/**
	 * @param empID
	 * @param empName
	 * @param age
	 * @param salary
	 */
	public Employee(int empID, String empName, int age, double salary) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.age = age;
		this.salary = salary;
	}
	/**
	 * @return the empID
	 */
	public int getEmpID() {
		return empID;
	}
	/**
	 * @param empID the empID to set
	 */
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	/**
	 * @return the empName
	 */
	public String getEmpName() {
		return empName;
	}
	/**
	 * @param empName the empName to set
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void validateSalary(double salary) throws EmployeeException{
		
		if(salary<3000)
			throw new EmployeeException("Salary cannot be less than 3000.");
		else
			System.out.println("Valid Salary.");
		
	}

}
