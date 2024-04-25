package com.DemoAop.AOP.Demo.dao;

import org.springframework.stereotype.Repository;

@Repository
public class accountDaoImpl implements AccountDao {

    @Override
    public void addAccount() {
        System.out.println(getClass()+" Adding Account ");
    }

    @Override
    public void getName() {
        System.out.println(getClass()+" Get Name ");
    }

    @Override
    public void setName(String s) {
        System.out.println(getClass()+" Set Name ");

    }
}
