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
public class MonthSummaryGetRes {
    private BigDecimal totalDebit;
    private BigDecimal totalCredit;
    private BigDecimal totalSum;
    private Integer month;
}
