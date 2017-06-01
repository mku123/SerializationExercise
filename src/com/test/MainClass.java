package com.test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.pojo.Department;
import com.pojo.Employee;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department scienceDept = new Department();
		scienceDept.setDeptId(1);
		scienceDept.setDeptName("Science");
		Employee e1 = new Employee(1, "Vishal", "Gupta", "Delhi",13000 ,scienceDept);
		scienceDept.setLead(e1);
		Employee e2 = new Employee(2, "Gaurav", "Sharma", "Noida",15000 ,scienceDept);
		Employee e3 = new Employee(3, "Rohit", "Mor", "Gurgaon",17000 ,scienceDept);
		Employee e4 = new Employee(4, "Prachi", "Desai", "Delhi",11000 ,scienceDept );
		Employee e5 = new Employee(5, "Mohit", "Chauhan", "Gurgaon", 15000, scienceDept);
		Employee e6 = new Employee(6, "Arijit", "Singh", "Delhi", 16000, scienceDept);
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		list.add(e6);
		ObjectMapper mapper = new ObjectMapper();
		File file = new File("D:\\file.json");
		try {
			mapper.writeValue(file, list);
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		TypeReference<ArrayList<Employee>> type1 = new TypeReference<ArrayList<Employee>>() {
		};
		ArrayList<Employee> ls=null;
		try {
			ls = mapper.readValue(file, type1);
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(Employee e: ls){
			System.out.println(e);
		}
	}

}
