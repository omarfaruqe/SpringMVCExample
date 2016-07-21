package com.mc.admissioncontroller;

import java.util.*;

import javax.validation.constraints.*;

public class Student {

	//Some other Annotation @Future, @Min, @NotNull, @NotEmpty
	
	@Pattern(regexp="[^0-9]*")
	private String studentName;
	
	@Size(min=2, max=30) @IsValidHobby //, message = "Please enter a value for student hobby field between {min} and {max} characters") //Form Validation jars required
	private String studentHobby;
	
	@Max(9999)
	private Long studentMobile;
	
	@Past
	private Date studentDOB;
	private ArrayList<String> studentSkills;

	private Address studentAddress;
	

	public Address getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(Address studentAddress) {
		this.studentAddress = studentAddress;
	}

	public Long getStudentMobile() {
		return studentMobile;
	}

	public void setStudentMobile(Long studentMobile) {
		this.studentMobile = studentMobile;
	}

	public Date getStudentDOB() {
		return studentDOB;
	}

	public void setStudentDOB(Date studentDOB) {
		this.studentDOB = studentDOB;
	}

	public ArrayList<String> getStudentSkills() {
		return studentSkills;
	}

	public void setStudentSkills(ArrayList<String> studentSkills) {
		this.studentSkills = studentSkills;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentHobby() {
		return studentHobby;
	}

	public void setStudentHobby(String studentHobby) {
		this.studentHobby = studentHobby;
	}
	
}
