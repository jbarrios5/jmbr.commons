package py.com.jmbr.java.commons.context;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerAdapter;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import py.com.jmbr.java.commons.exception.JMBRException;
import py.com.jmbr.java.commons.exception.JMBRExceptionType;
import py.com.jmbr.java.commons.logger.RequestUtil;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestContextInitializer implements HandlerInterceptor {
    private static final Logger logger = LoggerFactory.getLogger(RequestContextInitializer.class);
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        logger.info("Request{}",request.getRequestURI());
        if(request.getRequestURI().contains("/swagger"))
            return Boolean.TRUE;
        HandlerMethod handlerMethod = (HandlerMethod) handler;
        if(handlerMethod.getMethodAnnotation(SecurityAccess.class) == null)
            return Boolean.TRUE;
        if(handlerMethod.getMethodAnnotation(SecurityAccess.class).operation() == OperationAllow.POST_LOGIN){
            //Es para logueasr, pedimos el api key
            String apiKey = request.getHeader("api_key");
            if( apiKey == null){
                logger.warn(RequestUtil.LOG_FORMATT,"no-log-id","apiKey is required",null);
                throw new JMBRException("Error en autenticacion", JMBRExceptionType.FALTAL, HttpStatus.BAD_REQUEST);
            }
            if(!apiKey.equals(handlerMethod.getMethodAnnotation(SecurityAccess.class).apiKey())){
                logger.warn(RequestUtil.LOG_FORMATT,"no-log-id","apiKey no match",apiKey);
                throw new JMBRException("Error en autenticacion", JMBRExceptionType.FALTAL, HttpStatus.BAD_REQUEST);
            }

            return Boolean.TRUE;


        }

        return Boolean.TRUE;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
