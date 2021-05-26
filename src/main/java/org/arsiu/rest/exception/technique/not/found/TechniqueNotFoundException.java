package org.arsiu.rest.exception.technique.not.found;

public class TechniqueNotFoundException extends RuntimeException{

    public TechniqueNotFoundException(final String message) {
        super(message);
    }

    public TechniqueNotFoundException(final String message, final Throwable cause) {
        super(message, cause);
    }
}
