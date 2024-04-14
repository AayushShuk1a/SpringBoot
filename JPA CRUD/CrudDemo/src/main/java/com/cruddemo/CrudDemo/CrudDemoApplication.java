package com.cruddemo.CrudDemo;

import com.cruddemo.CrudDemo.dao.StudentDao;
import com.cruddemo.CrudDemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CrudDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudDemoApplication.class, args);
	}



	@Bean
	public CommandLineRunner commandLineRunner(StudentDao studentDao){
		return runner->{
			//createStudent(studentDao);
			//createMultipleStudents(studentDao);
			//getStudent(studentDao);
			//getAllStudent(studentDao);
			//getStudentByLastName(studentDao);
			//updateStudent(studentDao);
			deleteStudent(studentDao);
		};
	}

	private void deleteStudent(StudentDao studentDao) {


		studentDao.DeleteStudent(2);
	}

	private void updateStudent(StudentDao studentDao) {

		Student student=studentDao.findByID(6);
		student.setLastName("teja");

		studentDao.Update(student);
		System.out.println(student);
	}

	private void getStudentByLastName(StudentDao studentDao) {
		List<Student>theStudents=studentDao.findByLastName("shashtri");

		for(Student student:theStudents)
		{
			System.out.println(student);
		}
	}

	private void getAllStudent(StudentDao studentDao) {
		List<Student>theStudents=studentDao.findALL();

		for(Student students:theStudents)
		{
			System.out.println(students);
		}
	}

	private void getStudent(StudentDao studentDao) {
		Student tempStudent1 = new Student("Ravi", "shashtri", "ravi@luv2code.com");
		studentDao.save(tempStudent1);

		int id=tempStudent1.getId();
		Student student=studentDao.findByID(id);
		System.out.println("Generated Student is : "+student);
	}

	private void createMultipleStudents(StudentDao studentDao) {

		System.out.println("Creating 3 student objects ...");
		Student tempStudent1 = new Student("John", "Doe", "john@luv2code.com");
		Student tempStudent2 = new Student("Mary", "Public", "mary@luv2code.com");
		Student tempStudent3 = new Student("Bonita", "Applebum", "bonita@luv2code.com");

		studentDao.save(tempStudent1);
		studentDao.save(tempStudent2);
		studentDao.save(tempStudent3);
	}

	private void createStudent(StudentDao studentDao) {


		Student student1=new Student("John", "Doe", "john@luv2code.com");

		studentDao.save(student1);

		System.out.println("Saved student. Generated id: " + student1.getId());
	}
}
