package com.test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pojo.Employee;

public class DeserializeToEmployee {
	
	public static void deserializeToEmployee(File file){
		ObjectMapper mapper = new ObjectMapper();
		TypeReference<ArrayList<Employee>> type1 = new TypeReference<ArrayList<Employee>>() {
		};
		ArrayList<Employee> ls=null;
		try {
			ls = mapper.readValue(file, type1);
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		for(Employee e: ls){
			System.out.println(e);
		}
	}

}
