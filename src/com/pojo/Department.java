package com.pojo;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="lead")
public class Department implements Serializable{

	private static final long serialVersionUID = 1L;
	private int deptId;
	private String deptName;
	//private int leadEmployeeId;
	Employee lead;

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

//	public int getLeadEmployeeId() {
//		return leadEmployeeId;
//	}
//
//	public void setLeadEmployeeId(int leadEmployeeId) {
//		this.leadEmployeeId = leadEmployeeId;
//	}

	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + ", leadEmployeeId=" + lead.getEmpId() + "]";
	}

	public void setLead(Employee e1) {
		// TODO Auto-generated method stub
		this.lead = e1;
	}
	
	public Employee getLead() {
		return lead;
	}

}
