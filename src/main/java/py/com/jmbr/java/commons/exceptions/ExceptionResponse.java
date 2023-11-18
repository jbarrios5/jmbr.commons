package py.com.jmbr.java.commons.exceptions;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
public class ExceptionResponse {
    private final String message;
    private final JMBRExceptionType type;
}
