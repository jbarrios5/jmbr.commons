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
public class Church {
    private Integer id;
    private String name;
    private BigDecimal currentBalance;
    private String created;
}
