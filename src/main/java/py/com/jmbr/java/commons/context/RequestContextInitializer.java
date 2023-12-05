package py.com.jmbr.java.commons.context;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerAdapter;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.UriComponentsBuilder;
import py.com.jmbr.java.commons.exception.JMBRException;
import py.com.jmbr.java.commons.exception.JMBRExceptionType;
import py.com.jmbr.java.commons.logger.RequestUtil;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestContextInitializer implements HandlerInterceptor {
    private static final String AUTH_URI = "http://localhost:8081/mcs.auth/auth/v1";
    private static final Logger logger = LoggerFactory.getLogger(RequestContextInitializer.class);
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        logger.info("Request{}",request.getRequestURI());
        if(request.getRequestURI().contains("/swagger"))
            return Boolean.TRUE;
        HandlerMethod handlerMethod = (HandlerMethod) handler;
        logger.info("handlerMethod={}",handlerMethod);
        if(handlerMethod.getMethodAnnotation(SecurityAccess.class) == null)
            return Boolean.TRUE;
        if(handlerMethod.getMethodAnnotation(SecurityAccess.class).operation() == OperationAllow.POST_LOGIN){
            //Es para logueasr, pedimos el api key
            String apiKey = request.getHeader("api_key");
            if( apiKey == null){
                logger.warn(RequestUtil.LOG_FORMATT,"no-log-id","apiKey is required",null);
                throw new JMBRException("Error en autenticacion", JMBRExceptionType.FALTAL, HttpStatus.BAD_REQUEST);
             }
            return Boolean.TRUE;
        }
        logger.info("cheking at={}",request.getHeader("access_token"));
        if(!isAccessTokenValid(request.getHeader("access_token")))
            throw new JMBRException("Error en autenticacion", JMBRExceptionType.FALTAL, HttpStatus.BAD_REQUEST);


        return Boolean.TRUE;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }

    private boolean isAccessTokenValid(String accessToken){
        if(accessToken.isBlank()){
            logger.warn(RequestUtil.LOG_FORMATT,"no-log-id","accessToken is required",null);
            throw new JMBRException("Error en autenticacion", JMBRExceptionType.FALTAL, HttpStatus.BAD_REQUEST);
        }
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders header = new HttpHeaders();
        ResponseEntity<Boolean> response;
        HttpEntity<?> entity = new HttpEntity<>(HttpEntity.EMPTY,header);
        String URI = UriComponentsBuilder
                .fromUriString(AUTH_URI.concat("/verify"))
                .queryParam("access_token",accessToken)
                .toUriString();
        logger.info(RequestUtil.LOG_FORMATT,"no-log-id","isAccessTokenValid:request",entity.toString());
        response = restTemplate.exchange(URI, HttpMethod.GET,entity,Boolean.class);
        logger.info(RequestUtil.LOG_FORMATT,"no-log-id","isAccessTokenValid:response",response);
        if(response.getBody() != null)
            return response.getBody();
        else
            return false;
    }
}
