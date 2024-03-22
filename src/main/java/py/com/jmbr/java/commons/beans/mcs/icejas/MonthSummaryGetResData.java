package py.com.jmbr.java.commons.beans.mcs.icejas;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import py.com.jmbr.java.commons.domain.mcs.icejas.MonthSummaryGetRes;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class MonthSummaryGetResData {
    private List<MonthSummaryGetRes> months;
    private BigDecimal totalSum;
}
