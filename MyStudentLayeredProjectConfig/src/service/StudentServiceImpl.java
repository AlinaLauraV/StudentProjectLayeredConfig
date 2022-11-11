package service;

import java.util.Collection;


import entity.Student;
import persistence.StudentDao;
import persistence.StudentDaoImpl;

public class StudentServiceImpl implements StudentService {

	
	private StudentDao studentDao;
	
	
	public StudentServiceImpl(StudentDao studentDao) {
		super();
		this.studentDao = studentDao;
	}

	@Override
	public Collection<Student> getAllStudent() {
		return studentDao.getAllRecords();
	}

	@Override
	public Student searchStudentById(int id) {
		return studentDao.searchRecord(id);
	}

	@Override
	public boolean addStudent(Student student) {
		studentDao.insertRecord(student);
		return true;
	}
}

