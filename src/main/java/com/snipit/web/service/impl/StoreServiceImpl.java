package com.snipit.web.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.snipit.web.model.Snippet;
import com.snipit.web.model.repository.SnippetRepository;
import com.snipit.web.service.StoreService;

@Service
public class StoreServiceImpl implements StoreService {

    @Autowired
    private SnippetRepository snippetRepository;

    @Override
    public void storeSnippet(String snippetId, int popularity) {
	Snippet snippetById = snippetRepository.getSnippetById(snippetId);
	if (snippetById.getPopularity() < popularity) {
	    throw new IllegalArgumentException("Current popularity" + snippetById.getPopularity());
	}
	snippetById.setPopularity(snippetById.getPopularity() + popularity);
    }
}
