package com.employee.factory;
import com.employee.empDao.*;
public class FactoryEmpDao {
	private static EmpDao empdao=null;
	static
	{
		empdao=new EmpDaoImpl();
	}
	public static EmpDao getEmployeeDao()
	{
		return empdao;
	}

}
