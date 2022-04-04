package com.megastores.webstore.security;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


@EnableWebSecurity
public class SecurityConfigs extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("admin").password("1234").roles(Admin.ROLE_NAME).and()
                .withUser("user").password("qwerty").roles(User.ROLE_NAME);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()

                .antMatchers("/v1/cart/**").hasAnyRole(User.ROLE_NAME, Admin.ROLE_NAME)
                .antMatchers("/v1/order/**").hasAnyRole(Admin.ROLE_NAME)
                .antMatchers("/").permitAll()
                .and().formLogin();
    }

    @Bean
    PasswordEncoder providePasswordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }
}
