package com.snipit.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.snipit.web.service.SnippetService;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@RequestMapping("/snippets")
public class SnippetController {

    @Autowired
    private SnippetService snippetService;

    @RequestMapping
    public String list(Model model) {

	model.addAttribute("snippets", snippetService.getAllSnippets());
	return "snippets";
    }

    @RequestMapping("/all")
    public String allSnippets(Model model) {
	model.addAttribute("snippets", snippetService.getAllSnippets());
	return "snippets";
    }

    @RequestMapping("/{project}")
    public String getSnippetsByProject(Model model, @PathVariable("project") String snippetProject) {
	model.addAttribute("snippets", snippetService.getSnippetsByProject(snippetProject));
	return "snippets";
    }

    @RequestMapping("/filter/{Criteria}")
    public String getSnippetsByFilter(@MatrixVariable(pathVar = "Criteria") Map<String, List<String>> filterParams, Model model) {
	model.addAttribute("snippets", snippetService.getSnippetsByFilter(filterParams));
	return "snippets";
    }

}
