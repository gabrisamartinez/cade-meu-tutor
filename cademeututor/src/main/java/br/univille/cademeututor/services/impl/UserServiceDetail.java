package br.univille.cademeututor.services.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import br.univille.cademeututor.model.UserMember;
import br.univille.cademeututor.repository.UserRepository;
@Service
public class UserServiceDetail implements UserDetailsService {
  
    @Autowired
    private UserRepository repository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public void save(UserMember user){
        if (!user.getPassword().isEmpty()) 
            user.setPassword(passwordEncoder.encode(user.getPassword()));
        repository.save(user);
    }

    public UserMember searchUser(String userName){
        return repository.findByName(userName);
    }

    public UserMember searchUserPassword(String userName, String userPassword){
        return repository.findByNameAndPassword(userName, userPassword);
    }
  
    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        UserMember user = repository.findByName(userName);
        return new User(user.getName(),user.getPassword(), new ArrayList<>());
    }  

    public UserMember getUserLogged(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        UserMember user = repository.findByName(authentication.getName());
        return user;
    }
      
}