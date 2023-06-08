package com;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table (name="MyStudent") 
public class Student{
	@Id
	private int Uid;
	@Column (name="userName")
	private String name;
	private int salary;
	private String City;
	
	public Student() {
		
	}
	public Student(int uid, String name, int salary, String city) {
		super();
		Uid = uid;
		this.name = name;
		this.salary = salary;
		City = city;
	}


	public int getUid() {
		return Uid;
	}

	public void setUid(int uid) {
		Uid = uid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	@Override
	public String toString() {
		return "Student [Uid=" + Uid + ", name=" + name + ", salary=" + salary + ", City=" + City + "]";
	}
	
	
	
}
