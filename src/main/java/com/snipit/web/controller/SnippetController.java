package com.snipit.web.controller;

import com.snipit.web.model.Snippet;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.snipit.web.service.SnippetService;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
    
    // List all snippets
    @RequestMapping("/all")
    public String allSnippets(Model model) {
	model.addAttribute("snippets", snippetService.getAllSnippets());
	return "snippets";
    }
    
    // List snippets by project
    @RequestMapping("/{project}")
    public String getSnippetsByProject(Model model, @PathVariable("project") String snippetProject) {
	model.addAttribute("snippets", snippetService.getSnippetsByProject(snippetProject));
	return "snippets";
    }
    
    // Filter snippets by filter (label, project)
    @RequestMapping("/filter/{Criteria}")
    public String getSnippetsByFilter(@MatrixVariable(pathVar = "Criteria") Map<String, List<String>> filterParams, Model model) {
	model.addAttribute("snippets", snippetService.getSnippetsByFilter(filterParams));
	return "snippets";
    }
    
    // Fetch snippet by id
    @RequestMapping("/snippet")
    public String getSnippetById(Model model, @RequestParam("id") String snippetId) {
	Snippet snippet = snippetService.getSnippetById(snippetId);
	model.addAttribute("snippet", snippet);
	return "snippet";
    }

    // Adding new snippet - GET
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String getAddSnippet(Model model) {
	Snippet newSnippet = new Snippet();
	model.addAttribute("newSnippet", newSnippet);
	return "addSnippet";
    }
    
    // Adding new snippet - POST
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String setAddSnippet(@ModelAttribute("newProduct") Snippet newSnippet) {
	snippetService.addSnippet(newSnippet);
	return "redirect:/snippets/all";
    }
    
    @RequestMapping(value = "/delete/{id}", method=RequestMethod.GET)
    public String deleteSnippetAction(Model model, @PathVariable("id") String snippetId) {
	Snippet snippet = snippetService.getSnippetById(snippetId);
	snippetService.deleteSnippet(snippet);
	return "redirect:/snippets/";
    }
}
