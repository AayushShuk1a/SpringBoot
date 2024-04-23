package com.cruddemo.MappingsHibernate;
import com.cruddemo.MappingsHibernate.dao.AppDao;
import com.cruddemo.MappingsHibernate.entity.Course;
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
//			deleteInstructor(appDao);
			addCoursesToInstructor(appDao);

		};
	}

	private void addCoursesToInstructor(AppDao appDao) {
		Instructor instructor=new Instructor("Romario","Shepherd","sheperd@gmail.com");
		InstructorDetails instructorDetails=new InstructorDetails("shepherd Dogs","Cricket");

		Course tempCourse1=new Course("The Batting MasterClass");
		Course tempCourse2=new Course("Bowling Bootcamp");

		instructor.AddCourse(tempCourse1);
		instructor.AddCourse(tempCourse2);
		System.out.println("Instructor : "+instructor);
		System.out.println("Course : "+instructor.getCourses());
		appDao.save(instructor);


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
