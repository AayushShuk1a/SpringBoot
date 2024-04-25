package com.DemoAop.AOP.Demo;

import com.DemoAop.AOP.Demo.dao.Account;
import com.DemoAop.AOP.Demo.dao.AccountDao;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class AopDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AopDemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AccountDao accountDao){
		return runner->{

			//demoBeforeAdvice(accountDao);
			//findAllAccount(accountDao);
			demoAfterThrowing(accountDao);

		};
	}

	private void demoAfterThrowing(AccountDao accountDao) {
		List<Account>accounts=null;
		try {
			boolean tripwire=true;
			accountDao.findAccount(true);
		}
		catch (Exception exec){
			System.out.println(exec);
		}
	}

	private void findAllAccount(AccountDao accountDao) {
		List<Account>accounts=accountDao.findAccount();
		System.out.println(accounts);
	}


	private void demoBeforeAdvice(AccountDao accountDao) {
		Account account=new Account();
		account.setAge(12);
		account.setName("Tommy");
		accountDao.addAccount(account);
		//accountDao.getName();
		//accountDao.setName("Zero Two");
	}


}
