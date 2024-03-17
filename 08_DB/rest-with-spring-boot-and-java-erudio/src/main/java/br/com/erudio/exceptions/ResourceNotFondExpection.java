package br.com.erudio.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFondExpection extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public ResourceNotFondExpection(String ex) {
        super(ex);
    }
}
