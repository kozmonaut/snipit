package com.snipit.web.service;

import com.snipit.web.model.Snippet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public interface SnippetService {
    
    List<Snippet> getAllSnippets();
    Snippet getSnippetById(String snippetId);
    List<Snippet> getSnippetsByProject(String project);
    Set<Snippet> getSnippetsByFilter(Map<String, List<String>> filterParams);
}
