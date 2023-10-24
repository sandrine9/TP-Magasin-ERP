package com.bnpp.epita.spring.TPMagasinERP.application;

import com.bnpp.epita.spring.TPMagasinERP.domaine.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    //Par attribut
    //@Autowired
    //IClientService service;

    //OU par contructeur
    IClientService service;
    public UserDetailsServiceImpl(IClientService service){
        this.service=service;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Client client = service.findByemail(email);
        if(client==null ) throw new UsernameNotFoundException("Utilisateur introuvable");
        List<GrantedAuthority> auths = new ArrayList<>();
        client.getRoles().forEach((role) -> {
            GrantedAuthority authority = new SimpleGrantedAuthority(role.getNom());
            auths.add(authority);
            }
        );
        return new User(client.getEmail(), client.getPassword(), auths);
    }
}
