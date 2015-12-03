package com.snipit.web.service;

import java.util.List;
import com.snipit.web.model.User;

public interface UserService {

    List<User> getAllUsers();
    void add(User u);
}
