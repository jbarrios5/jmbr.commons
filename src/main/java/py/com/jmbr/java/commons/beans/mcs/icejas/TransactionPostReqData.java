package py.com.jmbr.java.commons.beans.mcs.icejas;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import py.com.jmbr.java.commons.domain.mcs.icejas.TransactionPostReq;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class TransactionPostReqData {
    @Valid
    @NotNull(message = "data is required")
    private TransactionPostReq data;
}
