package com.cruddemo.MappingsHibernate;
import com.cruddemo.MappingsHibernate.dao.AppDao;
import com.cruddemo.MappingsHibernate.entity.Instructor;
import com.cruddemo.MappingsHibernate.entity.InstructorDetails;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MappingsHibernateApplication {

	public static void main(String[] args) {
		SpringApplication.run(MappingsHibernateApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AppDao appDao){
		return runner->{
			//createInstructor(appDao);
			//findByID(appDao);
			//deleteInstructor(appDao);
			//findInstructorDetails(appDao);
			deleteInstructorByID(appDao);
		};
	}

	private void deleteInstructorByID(AppDao appDao) {
		int id=2;
		appDao.DeleteByInstructorDetailsId(2);
	}

	private void findInstructorDetails(AppDao appDao) {

		int id=2;
		InstructorDetails instructorDetails=appDao.findInstructorDetailsById(id);
		System.out.println("Instructor Details : "+instructorDetails+ " "+ instructorDetails.getInstructor());

	}

	private void findByID(AppDao appDao) {

		int id=1;
		Instructor instructor=appDao.findByID(id);
		System.out.println("Instructor : "+ instructor);

	}

	private void deleteInstructor(AppDao appDao) {
		int id=1;
		appDao.DeleteById(id);
	}

	private void createInstructor(AppDao appDao) {

		Instructor instructor=new Instructor("Aayush","Shukla","aayush@gmail.com");
		InstructorDetails instructorDetails=new InstructorDetails("test.youtube.com","Swimming");

		instructor.setInstructorDetails(instructorDetails);

		appDao.save(instructor);
		System.out.println("Instructor Details : "+instructor);


	}

}
