package com.employee.service;

import com.employee.emp.Employee;
import com.employee.empDao.*;
import com.employee.factory.*;
public class ServiceImpl implements Service {
	int status;
	String statuss=null;

	@Override
	public int addEmployee(Employee emp) {
		EmpDao empDao=FactoryEmpDao.getEmployeeDao();
		status=empDao.add(emp);
		
		return status;
	}

	@Override
	public Employee searchEmployee(int eid) {
		EmpDao studentDao=FactoryEmpDao.getEmployeeDao();
		Employee e=studentDao.search(eid);
		
		return e;
	}

	@Override
	public String updateEmployee(Employee emp) {
		EmpDao studentDao=FactoryEmpDao.getEmployeeDao();
		statuss=studentDao.update(emp);
		return statuss;
	}

	@Override
	public String deleteEmployee(int eid) {
		EmpDao empDao=FactoryEmpDao.getEmployeeDao();
		statuss=empDao.delete(eid);
		return statuss;
	}

}
