package com.snipit.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.snipit.web.model.Snippet;

@Controller
public class SnippetController {
	@RequestMapping("/snippets")
	public String list(Model model) {
		Snippet tomcat = new Snippet("1","Tomcat","Java");
		tomcat.setDescription("This is Tomcat AS configuration file.");
		tomcat.setProject("Project One");

		model.addAttribute("snippet", tomcat);
		return "snippets";
	}
}
