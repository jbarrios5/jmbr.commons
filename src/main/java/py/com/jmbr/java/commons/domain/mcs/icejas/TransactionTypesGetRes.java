package py.com.jmbr.java.commons.domain.mcs.icejas;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@NoArgsConstructor
public class TransactionTypeGetRes {
    @JsonProperty("transaction_types")
    List<TransactionType> transactionTypes;
}
