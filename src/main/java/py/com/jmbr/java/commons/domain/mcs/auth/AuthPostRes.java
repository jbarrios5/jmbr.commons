package py.com.jmbr.java.commons.domain.mcs.auth;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import py.com.jmbr.java.commons.domain.mcs.user.User;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class AuthPostRes {
    private User user;
    private AuthLogin login;


}
