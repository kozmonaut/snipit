package com.snipit.web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.snipit.web.model.User;
import com.snipit.web.model.repository.UserRepository;
import com.snipit.web.service.UserService;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @PersistenceContext
    private EntityManager em;

    @Transactional
    public List<User> getAllUsers() {
	List<User> result = em.createQuery("SELECT u FROM Users u", User.class).getResultList();
	return result;
    }

    @Transactional
    public void add(User u) {
	em.persist(u);
    }

}
