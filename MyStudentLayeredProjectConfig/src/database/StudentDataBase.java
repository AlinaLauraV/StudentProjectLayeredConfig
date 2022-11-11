package database;

import java.util.LinkedHashMap;
import java.util.Map;

import entity.Student;


public class StudentDataBase {

	static private Map<Integer, Student> studentList=new LinkedHashMap<Integer, Student>();
	
	
	static {
		studentList.put(101, new Student(101, "AAAA", 12000));
		studentList.put(102, new Student(102, "CCC", 93000));
		studentList.put(103, new Student(103, "EEE", 18000));
		
		
	}

	public static Map<Integer, Student> getStudentList() {
		return studentList;
	}
	
	
}
