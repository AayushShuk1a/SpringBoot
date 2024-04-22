package com.springsecurity.EmployeeSecurity.security;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class demoSecurityConfig {

    @Bean
    public InMemoryUserDetailsManager userDetailsManager(){
        UserDetails john= User.builder()
                .username("john")
                .password("{noop}test123")
                .roles("EMPLOYEE")
                .build();

        UserDetails mary=User.builder()
                .username("mary")
                .password("{noop}test123")
                .roles("EMPLOYEE","MANAGER")
                .build();

        UserDetails susan=User.builder()
                .username("susan")
                .password("{noop}test123")
                .roles("ADMIN","MANAGER","EMPLOYEE")
                .build();

        return  new InMemoryUserDetailsManager(john,mary,susan);
    }


    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(configurer->configurer.anyRequest().authenticated())
                .formLogin(form->form.loginPage("/showLoginPage")
                        .loginProcessingUrl("/authenticateUser")
                        .permitAll()
                )
                .logout(logout->logout.permitAll());

        return http.build();
    }
}
