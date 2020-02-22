package com.cg.eis.bean;

import java.io.Serializable;

public class Employee implements Serializable {
private int id;
private String name;
private double salary;
private String designation;
private String insurancescheme;
	public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public String getInsurancescheme() {
	return insurancescheme;
}
public void setInsurancescheme(String insurancescheme) {
	this.insurancescheme = insurancescheme;
}
public String toString()
{
	return "Employee Name : " +getName()+"\nEmployee ID: "+getId()+"\nEmployee Salary :"+getSalary();
}
}
