package com.cruddemo.CrudDemo.dao;

import com.cruddemo.CrudDemo.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Repository
public class StudentDAOImpl implements StudentDao{

    private EntityManager entityManager;

    @Autowired
    public StudentDAOImpl(EntityManager entityManager){
        this.entityManager=entityManager;
    }

    @Override
    @Transactional
    public void save(Student theStudent) {
        entityManager.persist(theStudent);
    }

    @Override
    public Student findByID(Integer id) {
        return entityManager.find(Student.class,id);
    }

    @Override
    public List<Student> findALL() {
        TypedQuery<Student> theQuery=entityManager.createQuery("FROM Student order by lastName",Student.class);
        return theQuery.getResultList();
    }

    @Override
    public List<Student> findByLastName(String LastName) {

        TypedQuery<Student>theQuery=entityManager.createQuery("FROM Student WHERE lastName=:theData",Student.class);

        theQuery.setParameter("theData",LastName);

        return theQuery.getResultList();
    }
}
