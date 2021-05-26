package org.arsiu.rest.exception.technique.not.found;

import org.arsiu.rest.exception.technique.TechniqueException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import java.time.ZoneId;
import java.time.ZonedDateTime;

@ControllerAdvice
public class TechniqueNotFoundExceptionHandler {
    @ExceptionHandler(TechniqueNotFoundException.class)
    public ResponseEntity<Object> handleTechniqueNotFoundException(final TechniqueNotFoundException e) {
        TechniqueException techniqueException = new TechniqueException(
                e.getMessage(),
                HttpStatus.NOT_FOUND,
                ZonedDateTime.now(ZoneId.of("Z"))
        );
        return new ResponseEntity<>(techniqueException, HttpStatus.NOT_FOUND);
    }
}
