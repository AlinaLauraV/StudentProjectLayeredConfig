package persistence;

import java.util.Collection;
import java.util.List;

import database.StudentDataBase;
import entity.Student;

public class StudentDaoImpl implements StudentDao {

	
	
	@Override
	public Collection<Student> getAllRecords() {
		return StudentDataBase.getStudentList().values();
	}

	@Override
	public Student searchRecord(int id) {
		return StudentDataBase.getStudentList().get(id);
		
	}

	@Override
	public Student insertRecord(Student student) {
		return StudentDataBase.getStudentList().put(student.getStudentId(), student);
	}

	

}