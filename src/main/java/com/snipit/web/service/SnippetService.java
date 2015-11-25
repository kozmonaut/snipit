package com.snipit.web.service;

import com.snipit.web.model.Snippet;
import java.util.List;

public interface SnippetService {
    
    List<Snippet> getAllSnippets();
    Snippet getSnippetById(String snippetId);
    List<Snippet> getSnippetsByProject(String project);
    
}
