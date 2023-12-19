package py.com.jmbr.java.commons.domain.mcs.icejas;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class TransactionPostReq {
    @NotNull(message = "transaction is required")
    @Valid
    private Transaction transaction;

    @NotNull(message = "church is required")
    @Valid
    private Church church;

    @NotNull(message = "user_id is required")
    private Integer userId;

    @NotNull(message = "transaction_type is required")
    private TransactionType transactionType;
}
