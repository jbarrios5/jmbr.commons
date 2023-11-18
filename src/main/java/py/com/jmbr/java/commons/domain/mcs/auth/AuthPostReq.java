package py.com.jmbr.java.commons.domain.mcs.auth;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class AuthPostReq {
    private String password;
    private String document;
}
