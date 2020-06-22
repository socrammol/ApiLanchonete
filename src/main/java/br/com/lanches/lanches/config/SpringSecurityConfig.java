package br.com.lanches.lanches.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.
		inMemoryAuthentication().
		withUser("teste").
		password(passwordEncoder().encode("123")).
		roles("ADMIN");
	}
	
	 @Override
	    public void configure(HttpSecurity http) throws Exception {
	       http.csrf().
	       disable().
	       authorizeRequests().antMatchers("/").
	       permitAll().
	       antMatchers(HttpMethod.POST,"/lanche").
	       permitAll().
	       antMatchers(HttpMethod.PUT, "/preco").
	       permitAll().
	       antMatchers(HttpMethod.GET, "/preco").
	       permitAll().
	       anyRequest().
	       authenticated();
	    }
	
	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
}
