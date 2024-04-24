package com.cruddemo.MappingsHibernate;
import com.cruddemo.MappingsHibernate.dao.AppDao;
import com.cruddemo.MappingsHibernate.entity.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class MappingsHibernateApplication {

	public static void main(String[] args) {
		SpringApplication.run(MappingsHibernateApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AppDao appDao){
		return runner->{

			//createCourseAndStudent(appDao);
			//findCourseFromStudentId(appDao);
			//addMoreCourses(appDao);
			DeleteStudent(appDao);

        };
	}

	private void DeleteStudent(AppDao appDao) {
		int id=3;
		appDao.DeleteStudentById(id);
	}


	private void addMoreCourses(AppDao appDao) {
		Student theStudent=appDao.findCourseByStudentId(4);
		Course tempCourse1=new Course("The art of Silence");
		Course tempCourse2=new Course("The art of hitting a six");
		theStudent.AddCourse(tempCourse1);
		theStudent.AddCourse(tempCourse2);
		appDao.UpdateStudent(theStudent);
	}

	private void findCourseFromStudentId(AppDao appDao) {
		Student student=appDao.findCourseByStudentId(4);
		System.out.println("Student : "+student);
		System.out.println("Courses : "+student.getCourses());
	}

	private void createCourseAndStudent(AppDao appDao) {
		Course course=new Course("Complete WebDev Bootcamp 2024");
		Student tempStudent1=new Student("Tim","David","david23@gmail.com");
		Student tempStudent2=new Student("yogi","Adityanath","yogi23@gmail.com");

		course.addStudent(tempStudent1);
		course.addStudent(tempStudent2);
		appDao.saveCourse(course);
		System.out.println("Course : "+course);
		System.out.println("Students : "+course.getStudents());
	}


	private void deleteCourseAndReviewById(AppDao appDao) {
		appDao.DeleteCourseById(10);
	}

	private void getCourseAndReviewById(AppDao appDao) {
		Course theCourse=appDao.findCourseAndReviewById(10);
		System.out.println("Course Details : "+theCourse);
		System.out.println("Reviews : "+theCourse.getReviews());
	}


	private void createCourseAndReview(AppDao appDao) {
		Course tempCourse=new Course("C++ Basic to Advance");
		tempCourse.addReview(new Review("Great Course Loved It"));
		tempCourse.addReview(new Review("Cool Course Job Well done"));

		appDao.saveCourse(tempCourse);
	}

	private void updateInstructor(AppDao appDao){
		Instructor instructor=appDao.findByID(1);
		instructor.setEmail("romarioShepherd@email.com");
		appDao.updateInstructor(instructor);
	}

	private void updateCourse(AppDao appDao) {
		Course course=appDao.findCourseById(10);
		course.setTitle("Boxing masterclass Bootcamp");
		appDao.updateCourse(course);
	}


	private void GetInstructorDetailsAndCourses(AppDao appDao) {
		int id=1;
		Instructor instructor=appDao.findInstructorAllDetails(id);
		System.out.println("Instructor Details : "+instructor);
		System.out.println("Course Details : "+instructor.getCourses());
	}

	private void GetCoursesForInstructorByID(AppDao appDao) {
		Instructor instructor=appDao.findByID(1);
		System.out.println("Instructor : "+instructor);

		List<Course>courses=appDao.findCoursesByInstructorId(1);
		instructor.setCourses(courses);

		System.out.println("Courses : "+ instructor.getCourses());
	}

	private void GetCoursesForInstructor(AppDao appDao) {
		int id=1;
		Instructor instructor=appDao.findByID(id);
		System.out.println(instructor.getCourses());
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
