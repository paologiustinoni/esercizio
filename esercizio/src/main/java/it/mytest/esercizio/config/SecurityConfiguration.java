package it.mytest.esercizio.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.csrf().disable();

		http.headers().frameOptions().disable();
		http.headers().frameOptions().sameOrigin();		
		
		http.csrf().disable().authorizeRequests().antMatchers("/").permitAll().and().authorizeRequests()
        .antMatchers("/h2-ui/**").permitAll();

	}
}
