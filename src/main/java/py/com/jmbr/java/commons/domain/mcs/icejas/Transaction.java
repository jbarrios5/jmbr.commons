package py.com.jmbr.java.commons.domain.mcs.icejas;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.sql.Date;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class Transaction {
    private Integer id;
    @NotNull(message = "amount can't be null")
    private BigDecimal amount;
    private String details;
    @NotNull(message = "register date can't be null")
    private Date registerDate;


}
