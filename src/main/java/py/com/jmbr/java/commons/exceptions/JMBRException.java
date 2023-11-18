package py.com.jmbr.java.commons.exceptions;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
public class JMBRException extends Exception{
    private JMBRExceptionType type;
    private HttpStatus code;

    public JMBRException(String message, JMBRExceptionType JMBRExceptionType, HttpStatus code) {
        super(message);
        this.type = JMBRExceptionType;
        this.code = code;
    }

}
