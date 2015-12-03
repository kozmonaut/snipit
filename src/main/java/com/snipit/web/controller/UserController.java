package com.snipit.web.controller;

import com.snipit.web.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.snipit.web.service.UserService;
import com.snipit.web.service.impl.UserServiceImpl;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public String list(Model model) {
	model.addAttribute("users", userService.getAllUsers());
	return "users";
    }

    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public String addUser(@ModelAttribute User user) {
	userService.add(user);
	return "redirect:/users";
    }

}
