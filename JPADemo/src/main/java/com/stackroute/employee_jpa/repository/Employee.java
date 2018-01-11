package com.stackroute.employee_jpa.repository;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="employee")	
public class Employee {
	private int eid;
	private String ename;
	private double salary;
	private String designation;
	
	public Employee(int eid, String ename, double salary, String designation) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
		this.designation = designation;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
		super();
	}

	/**
	 * @return the eid
	 */
	public int getEid() {
		return eid;
	}

	/**
	 * @param eid the eid to set
	 */
	public void setEid(int eid) {
		this.eid = eid;
	}

	/**
	 * @return the ename
	 */
	public String getEname() {
		return ename;
	}

	/**
	 * @param ename the ename to set
	 */
	public void setEname(String ename) {
		this.ename = ename;
	}

	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}

	/**
	 * @return the designation
	 */
	public String getDesignation() {
		return designation;
	}

	/**
	 * @param designation the designation to set
	 */
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	
	
}
