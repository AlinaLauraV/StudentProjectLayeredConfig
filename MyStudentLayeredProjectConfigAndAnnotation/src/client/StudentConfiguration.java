package client;


	import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

	import persistence.StudentDao;
	import persistence.StudentDaoImpl;
	import presentation.StudentPresentationImpl;
	import service.StudentServiceImpl;

	@Configuration
	@ComponentScan(basePackages = {"persistence", "presentation", "service"})
	public class StudentConfiguration {

		
	}


