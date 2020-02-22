package com.cg.eis.exception;
import java.util.Scanner;

import com.cg.eis.bean.Employee;
import com.cg.eis.pl.*;
class EmployeeException extends Exception
{
	EmployeeException(String s)
	{
		super(s);
	}
}
public class TestExceptionEmp extends Empuser{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the salary of an employee");
		Employee e1=new Employee();
		Scanner s=new Scanner(System.in);
		double salary=s.nextDouble();
		e1.setSalary(salary);
		
			

		try
		{
			if(salary<3000)
			{
				throw new EmployeeException("error");
			}
			else
				System.out.println("Employeee salary:"+e1.getSalary());
		}
			catch(Exception e)
			{
				System.out.println("caugth"+e);
			}
		}
	
	}


