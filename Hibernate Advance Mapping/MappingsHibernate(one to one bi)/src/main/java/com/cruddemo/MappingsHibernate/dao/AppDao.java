package com.cruddemo.MappingsHibernate.dao;

import com.cruddemo.MappingsHibernate.entity.Instructor;
import com.cruddemo.MappingsHibernate.entity.InstructorDetails;

public interface AppDao {
    public void save(Instructor theInstructor);

    public Instructor findByID(int id);

    public void DeleteById(int id);

    public InstructorDetails findInstructorDetailsById(int id);

    public void DeleteByInstructorDetailsId(int id);

}


