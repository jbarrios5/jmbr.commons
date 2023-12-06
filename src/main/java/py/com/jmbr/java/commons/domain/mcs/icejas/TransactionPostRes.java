package py.com.jmbr.java.commons.domain.mcs.icejas;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class TransactionPostRes {
    @JsonProperty("transaction_id")
    private Integer transactionId;
    private String message;
    private Integer status;
}
