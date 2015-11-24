package com.snipit.web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.snipit.web.model.User;
import com.snipit.web.model.repository.UserRepository;
import com.snipit.web.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
    private UserRepository userRepository;

	@Override
    public List<User> getAllUsers() {
	return userRepository.getAllUsers();
    }
    

}
