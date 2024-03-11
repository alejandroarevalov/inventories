package org.alava.inventories.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class NoProductFoundException extends RuntimeException {

    public NoProductFoundException(String productName) {
        super(String.format("No product found containing the word '%s'", productName));
    }
}
