package com.employee.service;
import com.employee.emp.Employee;
public interface Service {
	int addEmployee(Employee emp);
	Employee searchEmployee(int eid);
	String updateEmployee(Employee emp);
	String deleteEmployee(int eid);

}
