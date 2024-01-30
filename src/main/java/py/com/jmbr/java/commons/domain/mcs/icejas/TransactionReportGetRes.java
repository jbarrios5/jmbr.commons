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
public class TransactionReportGetRes {
    private BigDecimal totalDebit;
    private BigDecimal totalCredit;
    private Integer month;
}
