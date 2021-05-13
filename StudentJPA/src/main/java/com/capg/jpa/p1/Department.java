package com.capg.jpa.p1;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Department {
	
	@Id
	private String deptId;
	private String deptName;
	
	@OneToOne(mappedBy = "dept")
	private Student student;

	public String getDeptId() {
		return deptId;
	}

	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Department(String deptId, String deptName, Student student) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.student = student;
	}

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	

}
