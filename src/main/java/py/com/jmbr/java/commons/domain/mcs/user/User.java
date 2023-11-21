package py.com.jmbr.java.commons.domain.mcs.user;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class User {

    private Long id;
    private String name;
    @JsonIgnore()
    private String password;
    private String last_name;
    private Boolean status;
}
