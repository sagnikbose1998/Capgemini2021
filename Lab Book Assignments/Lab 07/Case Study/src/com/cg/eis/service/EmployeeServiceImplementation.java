package com.cg.eis.service;

import com.cg.eis.bean.Employee;
import com.cg.eis.hashMap.EmployeeHash;

public class EmployeeServiceImplementation implements EmployeeService {
    EmployeeHash ep = new EmployeeHash();

    public boolean addEmployee(Employee e) {
        return ep.addEmployee(e);
    }

    public String findInsuranceScheme(double sal, String desg) {
        return ep.findInsuranceScheme(sal, desg);

    }

    public Employee showEmployee(int id) {
        return ep.showEmployee(id);
    }
}
