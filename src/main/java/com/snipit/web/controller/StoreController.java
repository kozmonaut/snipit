package com.snipit.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.snipit.web.service.StoreService;

@Controller
public class StoreController {

    @Autowired
    private StoreService storeService;
    
    // Increase snippet popularity and redirect to snippets
    @RequestMapping("/store/2/2")
    public String process() {
	storeService.storeSnippet("2", 2);
	return "redirect:/snippets";
    }

}
