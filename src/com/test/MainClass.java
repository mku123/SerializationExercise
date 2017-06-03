package com.test;

import java.io.File;
import java.util.ArrayList;

import com.pojo.Department;
import com.pojo.Employee;

public class MainClass {

	public static void main(String[] args) {
		Department scienceDept = new Department();
		scienceDept.setDeptId(1);
		scienceDept.setDeptName("Science");
		Employee e1 = new Employee(1, "Vishal", "Gupta", "Delhi",13000 ,scienceDept);
		Employee e2 = new Employee(2, "Gaurav", "Sharma", "Noida",15000 ,scienceDept);
		Employee e3 = new Employee(3, "Rohit", "Mor", "Gurgaon",17000 ,scienceDept);
		Employee e4 = new Employee(4, "Prachi", "Desai", "Delhi",11000 ,scienceDept );
		scienceDept.setLead(e1);
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		File file = SerializeToJson.serializeToJson(list);	
		DeserializeToEmployee.deserializeToEmployee(file);
	}

}
