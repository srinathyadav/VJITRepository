package com.cg.eis.service;
import java.io.*;

import java.io.Serializable;
import com.cg.eis.bean.Employee;
public class Service implements EmployeeService{
Employee e=new Employee();
	
	@Override
	public String calculate(double sal, String desig) {
		// TODO Auto-generated method stub
		if(sal<20000 && sal>5000 && desig.equalsIgnoreCase("system associate"))
		{
			System.out.println("here");
			return "scheme c";
		}
		else if(sal<40000 && sal>=20000 && desig.equalsIgnoreCase("programmer"))
		{
			return "Scheme B";
		}
		else if(sal>=4000 && desig.equalsIgnoreCase("manager"))
		{
		 return "Scheme A";
		}
		else
		{
			return "No Scheme";
		}
		
	}

	@Override
	public void intoFile(Employee emp) {
		// TODO Auto-generated method stub
		try {
			/*
			 * File f=new File("D:/java capgemini/empdetails.txt"); f.createNewFile();
			 *///if(f.exists())
		    	//System.out.println("file created");
		    FileOutputStream fo=new FileOutputStream("D:/jdbc L8/empdetails.txt");
		    ObjectOutputStream os=new ObjectOutputStream(fo);
		 os.writeObject(emp);
		 os.close();
		 System.out.println("file written");
		}
			catch(Exception e1)
			{
			System.out.println("caught "+e1);	
		}
		
	}

	@Override
	public Object readFrom() {
		// TODO Auto-generated method stub
		try
		{
		FileInputStream fi=new FileInputStream("D:/jdbc L8/empdetails.txt");
		ObjectInputStream or=new ObjectInputStream(fi);
		Object ob=or.readObject();
	  or.close();
	        return ob;
		}
		catch(Exception e2)
		{
			System.out.println("caught in read"+e2);
		}
		return null;
	}
	
	
}
