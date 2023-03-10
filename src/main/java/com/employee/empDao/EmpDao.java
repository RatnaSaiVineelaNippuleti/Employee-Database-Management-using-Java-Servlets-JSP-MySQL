package com.employee.empDao;
import com.employee.emp.Employee;
public interface EmpDao {
	int add(Employee emp);
	Employee search(int eid);
	String update(Employee emp);
	String delete(int eid);
	

}
