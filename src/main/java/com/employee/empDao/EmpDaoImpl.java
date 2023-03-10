package com.employee.empDao;

import com.employee.emp.Employee;
import java.sql.*;
import com.employee.factory.*;

public class EmpDaoImpl implements EmpDao {
	   String statuss=null;
	   public static int status;
		
		
		public int add(Employee emp) {
			
			try {
				Connection con=FactoryConnection.getFactoryConnection();
				Statement st=con.createStatement();
				Employee empp=search(emp.getEid());
				if(empp==null)
				{   int e=emp.getEid();
				    String n=emp.getName();
				    String s=emp.getDOJ();
				    String a=emp.getDesignation();
					int rowcount=st.executeUpdate("INSERT INTO EMPLOYE VALUES("+e+",'"+n+"' ,"+s+",'"+a+"')");
					if(rowcount!=0)
					{
					    // status="student added successfully";
					     status=0;
					}
					else
					{
						//status="employee registration not successful";
						status=1;
					}
					
				}
				else
				{
					//status="Student already existed";
					status=2;
				}
			}
			catch(Exception e)
			{
				System.out.println("sdsd");
			}

			
			return status;
			
		}

		@Override
		public Employee search(int eid) {
			Employee employee=null;
			try {
				Connection con=FactoryConnection.getFactoryConnection();
				Statement st=con.createStatement();
				ResultSet rs=st.executeQuery("select * from EMPLOYE where ID="+eid);
				boolean b=rs.next();
				if(b==false)
				{
					//2
				  //employee not existed
					status=3;
					
				}
				else
				{
				  employee=new Employee();
				  employee.setEid(rs.getInt("ID"));
				  employee.setName(rs.getString("NAME"));
				  employee.setDOJ(rs.getString("DOJ"));
				  employee.setDesignation(rs.getString("Designation"));
				  status=2;
				  
				}
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			return employee;
		}

		@Override
		public String update(Employee employee) {
			try {
				Connection con=FactoryConnection.getFactoryConnection();
				Statement st=con.createStatement();
				boolean b=st.execute("update EMPLOYE set NAME='"+employee.getName()+"', DOJ='"+employee.getDOJ()+"', Designation='"+employee.getDesignation()+"' where ID="+employee.getEid());
			     if(b==false)
			     {
			    	 status=4;statuss="updated successfully";
			     }
			     else
			     {
			    	 status=5;statuss="not updated try again";
			     }
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			return statuss;
		}

		@Override
		public String delete(int no) {
			try {
				Connection con=FactoryConnection.getFactoryConnection();
				Statement st=con.createStatement();
				int rowcount=st.executeUpdate("delete from EMPLOYE WHERE ID="+no);
				if(rowcount!=0)
				{
					statuss="record deleted successfully";
					status=6;
				}
				else
				{
					statuss="record not existed";
					status=7;
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			return statuss;
		}
}
