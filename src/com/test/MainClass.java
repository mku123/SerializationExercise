package com.test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.pojo.Department;
import com.pojo.Employee;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department scienceDept = new Department();
		scienceDept.setDeptId(1);
		scienceDept.setDeptName("Science");
//		Employee e1 = new Employee(1, "Vishal", "Gupta", "Delhi",13000 ,scienceDept);
//		Employee e2 = new Employee(2, "Gaurav", "Sharma", "Noida",15000 ,scienceDept);
//		Employee e3 = new Employee(3, "Rohit", "Mor", "Gurgaon",17000 ,scienceDept);
//		Employee e4 = new Employee(4, "Prachi", "Desai", "Delhi",11000 ,scienceDept );
		Employee e = new Employee();
		e.setEmpId(1);
		e.setFirstName("Vishal");
		e.setLastName("Gupta");
		e.setSalary(13000);
		e.setCity("Delhi");
		e.setDepartment(scienceDept);
		
		Employee e2 = new Employee();
		e2.setEmpId(2);
		e2.setFirstName("Gaurav");
		e2.setLastName("Sharma");
		e2.setSalary(15000);
		e2.setCity("Delhi");
		e2.setDepartment(scienceDept);
		
		Employee e3 = new Employee();
		e3.setEmpId(3);
		e3.setFirstName("Prachi");
		e3.setLastName("Desai");
		e3.setSalary(14000);
		e3.setCity("Delhi");
		e3.setDepartment(scienceDept);
		
		scienceDept.setLead(e);
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(e);
		list.add(e2);
		list.add(e3);
		File file = SerializeToJson.serializeToJson(list);	
		DeserializeToEmployee.deserializeToEmployee(file);
	}

}
