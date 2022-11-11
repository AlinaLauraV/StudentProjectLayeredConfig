package client;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import presentation.StudentPresentation;


public class StudentClient {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		

		AnnotationConfigApplicationContext springContainer=new AnnotationConfigApplicationContext(StudentConfiguration.class);
		
		StudentPresentation studentPresentation=(StudentPresentation)springContainer.getBean("studentPresentation");
		while(true) {
			studentPresentation.showMenu();
			System.out.println("Enter Choice : ");
			int choice=scanner.nextInt();
			studentPresentation.performMenu(choice);
		}

	}

}
