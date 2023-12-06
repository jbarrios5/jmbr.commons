package py.com.jmbr.java.commons.domain.mcs.icejas;

import lombok.*;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class TransactionPostReq {
    @NotNull
    private Transaction transaction;
}
