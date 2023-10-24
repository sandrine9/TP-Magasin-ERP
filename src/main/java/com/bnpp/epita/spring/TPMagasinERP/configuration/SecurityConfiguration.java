package com.bnpp.epita.spring.TPMagasinERP.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import javax.sql.DataSource;

@Configuration
public class SecurityConfiguration {
    @Autowired
    private UserDetailsService userDetailsServiceToto;

    BCryptPasswordEncoder passwordEncoder;
    @Bean
    public BCryptPasswordEncoder passwordEncoder(){
        if(passwordEncoder==null) {
            this.passwordEncoder = new BCryptPasswordEncoder();
        }
        return this.passwordEncoder;
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception{
        this.passwordEncoder = new BCryptPasswordEncoder();
        auth.userDetailsService(userDetailsServiceToto)
                .passwordEncoder(passwordEncoder);
        //        .passwordEncoder(new BCryptPasswordEncoder());
    }
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.httpBasic()
                .and()
                .authorizeRequests()
                .antMatchers(HttpMethod.GET, "/swagger-ui/*").permitAll()
                //.antMatchers(HttpMethod.GET, "/api/v1/client*").hasRole("USER")
                //.antMatchers(HttpMethod.POST, "/api/v1/client").hasRole("ADMIN")
                //.antMatchers(HttpMethod.POST, "/api/v1/produit").hasRole("ADMIN")
                //.antMatchers(HttpMethod.GET, "/api/v1/produit/**").permitAll()
                //.antMatchers(HttpMethod.PUT, "/api/v1/produit/*").hasAnyRole("FOURNISSEUR", "ADMIN")
                //.anyRequest().denyAll()
                .and()
                .csrf().disable()
                .formLogin().disable();
        return http.build();
    }



}
