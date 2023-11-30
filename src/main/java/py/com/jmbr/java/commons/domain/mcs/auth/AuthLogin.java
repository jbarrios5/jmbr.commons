package py.com.jmbr.java.commons.domain.mcs.auth;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class AuthLogin {

    private String accessToken;
    private String  created;
    private String expires;

}
