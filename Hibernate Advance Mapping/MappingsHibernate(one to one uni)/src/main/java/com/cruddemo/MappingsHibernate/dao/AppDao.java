package com.cruddemo.MappingsHibernate.dao;

import com.cruddemo.MappingsHibernate.entity.Instructor;

public interface AppDao {
    public void save(Instructor theInstructor);

    public Instructor findByID(int id);

    public void DeleteById(int id);

}


