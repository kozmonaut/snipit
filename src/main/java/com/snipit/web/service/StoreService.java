package com.snipit.web.service;

import com.snipit.web.model.Snippet;

public interface StoreService {
    
    void storeSnippet(String snippetId, int count);
}
