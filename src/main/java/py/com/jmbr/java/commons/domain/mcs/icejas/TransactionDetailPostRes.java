package py.com.jmbr.java.commons.domain.mcs.icejas;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
@Getter
@Setter
@NoArgsConstructor
public class TransactionDetailPostRes {
    private Integer transactionId;
    private BigDecimal amount;
    private BigDecimal currentBalance;
    private String registerDate;
    private Integer userId;
}
