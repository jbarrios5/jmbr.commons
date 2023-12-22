package py.com.jmbr.java.commons.domain.mcs.icejas;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
@Getter
@Setter
@NoArgsConstructor
@ToString
public class TransactionDetailPostRes {
    private Integer transactionId;
    private BigDecimal amount;
    private String transactionTypeName;
    private String transactionCategory;
    private BigDecimal currentBalance;
    private String transactionDetail;
    private String registerDate;
    private Integer userId;
}
