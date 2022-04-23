package com.edu1;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity  //create table Student
@Table(name="eduemployee")  //change the table name
public class Employee {
	@Column(name="employeeid",nullable=false)
	@Id   //primary key
	@GeneratedValue(strategy = GenerationType.AUTO) //to generate the primary key automatically
private int eid;
   @Column(name="employeename",nullable=false,length=30)  //not null
   
private String ename;
   @Column(name="employeesalary",nullable=true)
private double esalary;
//generate setter and getter method 
//generate toString
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public double getEsalary() {
	return esalary;
}
public void setEsalary(double esalary) {
	this.esalary = esalary;
}
@Override
public String toString() {
	return "Employee [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + "]";
}



}



