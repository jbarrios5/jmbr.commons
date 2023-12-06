package py.com.jmbr.java.commons.domain.mcs.icejas;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
@NoArgsConstructor
@Getter
@Setter
@ToString
public class BalanceHistory {
    private Integer id;
    private BigDecimal currentBalance;
    private BigDecimal previousBalance;
    private Integer churchId;
    private Integer transactionId;
    private String created;
}
