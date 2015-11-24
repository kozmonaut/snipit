package com.snipit.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.snipit.web.service.SnippetService;
import org.springframework.beans.factory.annotation.Autowired;

@Controller
public class SnippetController {
    
    @Autowired
    private SnippetService snippetService;
    @RequestMapping("/snippets")
    public String list(Model model) {

	model.addAttribute("snippets", snippetService.getAllSnippets());
	return "snippets";
    }
    
}
