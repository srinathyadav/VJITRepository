package com.cg.eis.bean;

import java.util.*;

public class Hashmap extends Employee 
{
	public static void main(String args[])
	{
		  Map<String, Employee> h = new HashMap<String, Employee>();

		  Employee employee1 = new Employee();
		  employee1.setName("bharath");
		  employee1.setDesignation("Developer");
		  employee1.setSalary(10000.50f);
		  employee1.setInsurancescheme("lic");
		  
		  Employee employee2 = new Employee();
		  employee2.setName("shashi");
		  employee2.setDesignation("Developer");
		  employee2.setSalary(10000.70f);
		  employee2.setInsurancescheme("arogya");
		  
	  h.put("bharath", employee1 );
     h.put("shashi", employee2);
	  
		  Scanner sc = new Scanner(System.in);
		  System.out.print("Enter Insurance Scheme : ");
		  String s = sc.next();

		  if(s.equalsIgnoreCase("lic"))
		  {
			  Set set = h.entrySet();
			  Iterator it = set.iterator();
			  while(it.hasNext())
			  {	  
				  Map.Entry me = (Map.Entry) it.next();
				  if(me.getValue().equals(employee1))
				  {
					  Employee emp = (Employee) me.getValue();
					  if(s.equalsIgnoreCase(emp.getInsurancescheme()))
					  {
             	  
				  System.out.println(me.getKey() + " : " + emp.getSalary());
				  System.out.println("details are\n"+emp.getName()+"\n"+emp.getDesignation());
					  }
					  
					  }
				  else if(me.getValue().equals(employee2))
				  {
					  Employee emp = (Employee) me.getValue();
					  if(s.equalsIgnoreCase(emp.getInsurancescheme()))
					  {
             	  
				  System.out.println(me.getKey() + " : " + emp.getSalary());
				  System.out.println("details are\n"+emp.getName()+"\n"+emp.getDesignation());
					  }
					  
				  }			  
			}
			 
		  }
		 else if(s.equalsIgnoreCase("arogya"))
		  {
			  Set set = h.entrySet();
			  Iterator it = set.iterator();
			  while(it.hasNext())
			  {	  
				  Map.Entry me = (Map.Entry) it.next();
				  if(me.getValue().equals(employee2))
				  {
					  Employee emp = (Employee) me.getValue();
					  if(s.equalsIgnoreCase(emp.getInsurancescheme()))
					  {
            	  
				  System.out.println(me.getKey() + " : " + emp.getSalary());
				  System.out.println("details are\n"+emp.getName()+"\n"+emp.getDesignation());
					  }
					  
					  }
				  else if(me.getValue().equals(employee2))
				  {
					  Employee emp = (Employee) me.getValue();
					  if(s.equalsIgnoreCase(emp.getInsurancescheme()))
					  {
            	  
				  System.out.println(me.getKey() + " : " + emp.getSalary());
				  System.out.println("details are\n"+emp.getName()+"\n"+emp.getDesignation());
					  }
			  
	}
}
		  }
	}
}
