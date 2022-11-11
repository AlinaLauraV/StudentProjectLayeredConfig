package presentation;

import java.util.Collection;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import entity.Student;
import service.StudentService;
import service.StudentServiceImpl;

@Component("studentPresentation")
public class StudentPresentationImpl implements StudentPresentation {

	
	private StudentService studentService;
	
	@Autowired
	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}

	@Override
	public void showMenu() {
		System.out.println("===========================");
		System.out.println("1. List All Students");
		System.out.println("2. Search Student By ID");
		System.out.println("3. Add New Student");
		System.out.println("4. Exit");
		System.out.println("============================");

	}

	@Override
	public void performMenu(int choice) {
		Scanner scanner=new Scanner(System.in);
		switch (choice) {
		case 1:
			Collection<Student> student=studentService.getAllStudent();
			for(Student bk:student) {
				System.out.println(bk);
			}
			break;
		case 2:
			System.out.println("Enter Student ID : ");
			int id=scanner.nextInt();
			Student students=studentService.searchStudentById(id);
			if(students!=null)
				System.out.println(students);
			else
				System.out.println("Student with id "+id+" doesnot exist");
			break;
		case 3:
			Student newStudent=new Student();
			
			System.out.println("Enter Student id : ");
			newStudent.setStudentId(scanner.nextInt());
			System.out.println("Enter Student name : ");
			newStudent.setStudentName(scanner.next());
			System.out.println("Enter student grade: ");
			newStudent.setGrades(scanner.nextDouble());
			
			if(studentService.addStudent(newStudent))
				System.out.println("Student Record Added");
			else
				System.out.println("Student with rollNo "+newStudent.getStudentId()+" already exist, so cannot add it as a new student!");
			
			break;
		
		case 4:
			System.out.println("Thank you!");
			System.exit(0);
		default:
			System.out.println("Invalid Choice!");
			break;
		}

	}

}
