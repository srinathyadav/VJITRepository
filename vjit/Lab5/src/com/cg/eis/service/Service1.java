package com.cg.eis.service;

public class Service1 implements EmployeeService1{

	public void ServiceScheme(double sal)
	{
		if(sal>5000&&sal<20000)
		{
			 String Designation="System Associate";
			 String Insurance="Scheme C";
			 System.out.println("Designation:"+Designation);
			 System.out.println("Insurance Scheme:"+Insurance);
		}
		else if(sal>=20000&&sal<40000)
		{
			 String Designation="Programmer";
			 String Insurance="Scheme B";
			 System.out.println("Designation:"+Designation);
			 System.out.println("Insurance Scheme:"+Insurance);
		}
		else if(sal>=40000)
		{
			 String Designation="Manager";
			 String Insurance="Scheme A";
			 System.out.println("Designation:"+Designation);
			 System.out.println("Insurance Scheme:"+Insurance);
		}
		
		else
		{
			 String Designation="Clerk";
			 String Insurance="NO Scheme";
			 System.out.println("Designation:"+Designation);
			 System.out.println("Insurance Scheme:"+Insurance);
		}
			
			
	}
			
		}