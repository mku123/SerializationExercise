package com.pojo;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="lead")
public class Department {

	private int deptId;
	private String deptName;
	private Employee lead;

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
	
	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + ", lead=" + lead + "]";
	}

	public void setLead(Employee lead) {
		// TODO Auto-generated method stub
		this.lead = lead;
	}
	
	public int getLead() {
		return lead.getEmpId();
	}

}
