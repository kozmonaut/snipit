package com.snipit.web.service;

public interface StoreService {
    
    void likeSnippet(String snippetId, int count);
    void dislikeSnippet(String snippetId, int count);
}
