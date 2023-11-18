package py.com.jmbr.java.commons.logger;

import java.util.UUID;

public class RequestUtil {
    private RequestUtil(){}

    public static String getLogId(){
        return UUID.randomUUID().toString();
    }
    public static String LOG_FORMATT = "log_id={},message={},data={}";
}
