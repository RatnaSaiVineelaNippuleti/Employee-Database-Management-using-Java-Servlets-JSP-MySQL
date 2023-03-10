package com.employee.factory;
import com.employee.service.Service;
import com.employee.service.ServiceImpl;
public class FactoryService {
	private static Service service=null;
	static
	{   
				service=new ServiceImpl();
	}
	public static Service getEmpService()
	{
		return service;
	}
			
}

