package com.snipit.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.snipit.web.model.Snippet;
import com.snipit.web.model.repository.SnippetRepository;
import org.springframework.beans.factory.annotation.Autowired;

@Controller
public class SnippetController {
    
    @Autowired
    private SnippetRepository snippetRepository;

    @RequestMapping("/snippets")
    public String list(Model model) {

	model.addAttribute("snippets", snippetRepository.getAllSnippets());
	return "snippets";
    }
    
}
