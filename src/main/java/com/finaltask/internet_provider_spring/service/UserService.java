package com.finaltask.internet_provider_spring.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import com.finaltask.internet_provider_spring.domain.User;
import com.finaltask.internet_provider_spring.repos.UserRepo;

@Service
public class UserService implements UserDetailsService {
    @Autowired
	private UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String login) {
        return userRepo.findByLogin(login);
    }

    public Optional<User> findUserById(long id) {
        return userRepo.findById(id);
    }
}
