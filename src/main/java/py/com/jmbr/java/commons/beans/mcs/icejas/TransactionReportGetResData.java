package py.com.jmbr.java.commons.beans.mcs.icejas;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import py.com.jmbr.java.commons.domain.mcs.icejas.TransactionReportGetRes;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class TransactionReportGetResData {
    private List<TransactionReportGetRes> data;
}
