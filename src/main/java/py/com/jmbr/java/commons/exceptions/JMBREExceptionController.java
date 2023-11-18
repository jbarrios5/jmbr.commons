package py.com.jmbr.java.commons.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class JMBREExceptionController {
    @ExceptionHandler(JMBRException.class)
    public ResponseEntity<ExceptionResponse> handleException(JMBRException e){
        return new ResponseEntity<ExceptionResponse>(new ExceptionResponse(e.getMessage(),e.getType()),e.getCode());
    }


}
