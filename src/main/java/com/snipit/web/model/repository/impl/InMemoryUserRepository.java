package com.snipit.web.model.repository.impl;

import java.util.ArrayList;
import java.util.List;

import com.snipit.web.model.Snippet;
import com.snipit.web.model.User;
import com.snipit.web.model.repository.UserRepository;
import org.springframework.stereotype.Repository;

@Repository
public class InMemoryUserRepository implements UserRepository {

    private List<User> listOfUsers = new ArrayList<User>();

    // Create dummy users
    public InMemoryUserRepository() {
	User user1 = new User("1011", "John Johnny", "Developer");
	user1.setEmail("mail@example.com");
	User user2 = new User("2022", "Mike Mickey", "Dev-ops");
	user2.setEmail("mail@example.com");

	listOfUsers.add(user1);
	listOfUsers.add(user2);

    }

    // List of all snippets
    public List<User> getAllUsers() {
	return listOfUsers;

    }
}
