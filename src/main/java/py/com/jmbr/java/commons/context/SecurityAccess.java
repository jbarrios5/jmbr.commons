package py.com.jmbr.java.commons.context;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value = ElementType.METHOD)
@Retention(value = RetentionPolicy.RUNTIME)
public @interface SecurityAccess {
    OperationAllow operation() default OperationAllow.POST_LOGIN;
}
