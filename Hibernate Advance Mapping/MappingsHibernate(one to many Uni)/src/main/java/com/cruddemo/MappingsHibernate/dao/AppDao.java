package com.cruddemo.MappingsHibernate.dao;

import com.cruddemo.MappingsHibernate.entity.Course;
import com.cruddemo.MappingsHibernate.entity.Instructor;
import com.cruddemo.MappingsHibernate.entity.Review;

import java.util.List;

public interface AppDao {
    public void save(Instructor theInstructor);

    public Instructor findByID(int id);

    public void DeleteById(int id);

    public List<Course> findCoursesByInstructorId(int id);

    public Instructor findInstructorAllDetails(int id);

    void updateInstructor(Instructor instructor);

    Course findCourseById(int id);

    void updateCourse(Course course);

    void saveCourse(Course theCourse);

    Course findCourseAndReviewById(int id);

    void DeleteCourseById(int id);

}


