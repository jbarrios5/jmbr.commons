package py.com.jmbr.java.commons.domain.mcs.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@NoArgsConstructor
public class UserPostRes {
    @JsonProperty("is_inserted")
    private Boolean isInserted;
    private String message;
}
