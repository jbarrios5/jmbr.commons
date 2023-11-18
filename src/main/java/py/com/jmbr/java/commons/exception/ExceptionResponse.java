package py.com.jmbr.java.commons.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ExceptionResponse {
    private final String message;
    private final JMBRExceptionType type;
}
