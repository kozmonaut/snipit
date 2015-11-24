package com.snipit.web.model.repository;
import com.snipit.web.model.Snippet;
import java.util.List;

public interface SnippetRepository {
    List <Snippet> getAllSnippets();
    Snippet getSnippetById(String snippetId);
}
