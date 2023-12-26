package py.com.jmbr.java.commons.domain.mcs.icejas;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
@Getter
@Setter
@NoArgsConstructor
public class TransactionDetails {
    private Integer transactionId;
    private BigDecimal amount;
    private String transactionTypeName;
    private String transactionCategory;
    private BigDecimal currentBalance;
    private String transactionDetail;
    private String registeredDate;
    private Integer userId;
}
