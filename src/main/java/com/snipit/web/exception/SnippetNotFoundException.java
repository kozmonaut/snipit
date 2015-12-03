package com.snipit.web.exception;

public class SnippetNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 3935230281455340039L;
    
    private String snippetId;
    
    public SnippetNotFoundException(String snippetId) {
	this.snippetId = snippetId;
    }
    
    public String getSnippetId() {
	return snippetId;
    }
}
