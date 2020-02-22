package com.cg.eis.pl;

import java.util.Scanner;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.Service;
import com.cg.eis.service.Service1;

public class Empuser {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter the employer details....");
Scanner a=new Scanner(System.in);
int id=a.nextInt();
String empname=a.next();
double salary=a.nextDouble();

Employee e1=new Employee();
e1.setId(id);
e1.setName(empname);
e1.setSalary(salary);
System.out.println("enter the employer 2 details...");
int id1=a.nextInt();
String empname1=a.next();
double salary1=a.nextDouble();
Employee e2=new Employee();
e2.setId(id1);
e2.setName(empname1);
e2.setSalary(salary1);

a.close();
System.out.println(e1.toString());
Service1 s=new Service1();
s.ServiceScheme(salary);
System.out.println(e2.toString());
s.ServiceScheme(salary1);
	}

}
