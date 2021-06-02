package com.cg.eis.service;

import com.cg.eis.bean.Employee;

public interface EmployeeService {
    public boolean addEmployee(Employee e);
    public String findInsuranceScheme(double sal, String desg);
    public Employee showEmployee(int id);
}
