package com.cruddemo.MappingsHibernate.dao;

import com.cruddemo.MappingsHibernate.entity.Instructor;
import com.cruddemo.MappingsHibernate.entity.InstructorDetails;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
public class AppDaoImpl implements AppDao{

    private EntityManager entityManager;

    @Autowired
    public AppDaoImpl(EntityManager entityManager){
        this.entityManager=entityManager;
    }

    @Override
    @Transactional
    public void save(Instructor theInstructor) {

        entityManager.persist(theInstructor);
    }

    @Override
    public Instructor findByID(int id) {
        Instructor instructor=entityManager.find(Instructor.class,id);
        return instructor;
    }


    @Override
    @Transactional
    public void DeleteById(int id) {

        Instructor instructor=entityManager.find(Instructor.class,id);
        entityManager.remove(instructor);


    }

    @Override
    public InstructorDetails findInstructorDetailsById(int id) {
        InstructorDetails instructorDetails=entityManager.find(InstructorDetails.class,id);
        return instructorDetails;
    }

    @Override
    @Transactional
    public void DeleteByInstructorDetailsId(int id) {
        InstructorDetails instructorDetails=entityManager.find(InstructorDetails.class,id);

        entityManager.remove(instructorDetails);
    }
}
