package py.com.jmbr.java.commons.domain.mcs.icejas;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Transaction {
    private Integer id;
    private BigDecimal amount;
    @JsonProperty("transaction_type")
    private Integer transactionType;
    @JsonProperty("user_id")
    private Integer userId;
    @JsonProperty("church_id")
    private Integer churchId;
    private String details;
    private String created;


}
