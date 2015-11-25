package com.snipit.web.service.impl;

import com.snipit.web.model.Snippet;
import com.snipit.web.model.repository.SnippetRepository;
import com.snipit.web.service.SnippetService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SnippetServiceImpl implements SnippetService {

    @Autowired
    private SnippetRepository snippetRepository;

    @Override
    public List<Snippet> getAllSnippets() {
	return snippetRepository.getAllSnippets();
    }
    
    @Override
    public Snippet getSnippetById(String snippetId) {
	return snippetRepository.getSnippetById(snippetId);
    }
    
    @Override
    public List<Snippet> getSnippetsByProject(String project) {
	return snippetRepository.getSnippetsByProject(project);
    }

}
