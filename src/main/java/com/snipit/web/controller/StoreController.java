package com.snipit.web.controller;

import com.snipit.web.model.Snippet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.snipit.web.service.StoreService;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class StoreController {

    @Autowired
    private StoreService storeService;
    
    // Increase snippet popularity and redirect to snippets
    @RequestMapping("/like/{id}/1")
    public String process(Model model, @PathVariable("id") String snippetId) {
	storeService.storeSnippet(snippetId, 1);
	return "redirect:/snippets/snippet?id={id}";
    }

}
