package com.cruddemo.MappingsHibernate.dao;

import com.cruddemo.MappingsHibernate.entity.Course;
import com.cruddemo.MappingsHibernate.entity.Instructor;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


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
    public List<Course> findCoursesByInstructorId(int id) {
        TypedQuery<Course>query=entityManager.createQuery("from Course where instructor.id=:data",Course.class);
        query.setParameter("data",id);
        List<Course>courses=query.getResultList();
        return courses;
    }

    @Override
    public Instructor findInstructorAllDetails(int id) {  //LEFT return if the value is null
        TypedQuery<Instructor>query=entityManager.createQuery("select i from Instructor i "
                                                                        +"LEFT JOIN FETCH i.Courses "
                                                                        +"LEFT JOIN FETCH i.instructorDetails "
                                                                        +"where i.id=:data",Instructor.class);
        query.setParameter("data",id);

        Instructor instructor=query.getSingleResult();

        return instructor;
    }
}
