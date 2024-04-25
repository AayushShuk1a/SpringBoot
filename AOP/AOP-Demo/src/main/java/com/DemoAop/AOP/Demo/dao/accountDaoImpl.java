package com.DemoAop.AOP.Demo.dao;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class accountDaoImpl implements AccountDao {

    @Override
    public void addAccount(Account account) {
        System.out.println(getClass()+" Adding Account ");
    }

    @Override
    public List<Account> findAccount() {
        Account tempAccount1=new Account("madhu",15);
        Account tempAccount2=new Account("Tommy",12);
        List<Account>theAccount=new ArrayList<>();
        theAccount.add(tempAccount1);
        theAccount.add(tempAccount2);
        return theAccount;
    }

    @Override
    public List<Account> findAccount(boolean tripwire) {
        if(tripwire){
            throw new RuntimeException("Program Failed");
        }

        Account tempAccount1=new Account("madhu",15);
        Account tempAccount2=new Account("Tommy",12);
        List<Account>theAccount=new ArrayList<>();
        theAccount.add(tempAccount1);
        theAccount.add(tempAccount2);
        return theAccount;

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
