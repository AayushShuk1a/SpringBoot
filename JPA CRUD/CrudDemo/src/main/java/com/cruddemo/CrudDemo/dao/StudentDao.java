package com.cruddemo.CrudDemo.dao;

import com.cruddemo.CrudDemo.entity.Student;

import java.util.List;

public interface StudentDao {

    void save(Student theStudent);

    public Student findByID(Integer id);


    List<Student> findALL();

    List<Student> findByLastName(String LastName);


    public void Update(Student student);

    public void DeleteStudent(Integer id);

    public int DeleteALl();
}
