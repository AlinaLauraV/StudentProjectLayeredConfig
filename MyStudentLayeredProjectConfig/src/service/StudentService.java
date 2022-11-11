package service;

import java.util.Collection;


import entity.Student;


public interface StudentService {

	Collection<Student> getAllStudent();
	
	Student searchStudentById(int id);
	
	boolean addStudent(Student student);
	
}
