package com.DemoAop.AOP.Demo;

import com.DemoAop.AOP.Demo.dao.AccountDao;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AopDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AopDemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AccountDao accountDao){
		return runner->{

			demoBeforeAdvice(accountDao);

		};
	}

	private void demoBeforeAdvice(AccountDao accountDao) {
		accountDao.addAccount();
		accountDao.getName();
		accountDao.setName("Zero Two");
	}


}
