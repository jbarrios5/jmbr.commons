package py.com.jmbr.java.commons.domain.mcs.icejas;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Transaction {
    private Integer id;
    private BigDecimal amount;

    @NotNull(message = "transaction_type is required")
    @JsonProperty("transaction_type")
    private Integer transactionType;

    @NotNull(message = "user_id is required")
    @JsonProperty("user_id")
    private Integer userId;

    @NotNull(message = "church_id is required")
    @JsonProperty("church_id")
    private Integer churchId;
    private String details;

    private String created;


}
