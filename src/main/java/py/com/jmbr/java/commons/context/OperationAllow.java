package py.com.jmbr.java.commons.context;

public enum OperationAllow {
    GET_USER("N"),
    ADD_USER("S");

    private String value;

    OperationAllow(String value){
        this.value = value;
    }
}
