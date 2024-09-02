package com.cyber;

import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "student_Details")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="FirstName", nullable = false)
	private String firstName;
	
	@Column(name = "LastName")
	private String lastName;
	
	@Column(name = "EmailID")
	private String emaiID;
	
	@Column(name = "Branch")
	private String branch;
	
	
public Student( String firstName, String lastName, String emaiID, String branch) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.emaiID = emaiID;
		this.branch = branch;
	}
	public Student() {
		
	}
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmaiID() {
		return emaiID;
	}
	public void setEmaiID(String emaiID) {
		this.emaiID = emaiID;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
}
