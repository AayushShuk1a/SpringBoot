package com.cruddemo.MappingsHibernate.dao;

import com.cruddemo.MappingsHibernate.entity.Course;
import com.cruddemo.MappingsHibernate.entity.Instructor;

import java.util.List;

public interface AppDao {
    public void save(Instructor theInstructor);

    public Instructor findByID(int id);

    public void DeleteById(int id);

    public List<Course> findCoursesByInstructorId(int id);

}


