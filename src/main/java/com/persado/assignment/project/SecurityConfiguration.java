package com.persado.assignment.project;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {
        //disable login for any resource
        httpSecurity.authorizeRequests().anyRequest().permitAll();

        //allow h2-console in addition with Spring Security
        httpSecurity.csrf().disable();
        httpSecurity.headers().frameOptions().disable();

    }

}
