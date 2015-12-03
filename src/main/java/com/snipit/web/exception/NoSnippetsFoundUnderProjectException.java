package com.snipit.web.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "No snippets found under this project")
public class NoSnippetsFoundUnderProjectException extends RuntimeException {

    private static final long serialVersionUID = 3935230281455340039L;

}
