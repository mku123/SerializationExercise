package com.test;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pojo.Employee;

public class SerializeToJson {
	
	public static File serializeToJson(List<Employee> list){
		
		ObjectMapper mapper = new ObjectMapper();
		File file = new File("D:\\file.json");
		try {
			mapper.writeValue(file, list);
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return file;
	}

}
