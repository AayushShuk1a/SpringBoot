package com.DemoAop.AOP.Demo.dao;


import java.util.List;

public interface AccountDao {

    public void addAccount(Account account);
    public List<Account> findAccount();
    public List<Account>findAccount(boolean tripwire);
    public void getName();
    public void setName(String s);
}
