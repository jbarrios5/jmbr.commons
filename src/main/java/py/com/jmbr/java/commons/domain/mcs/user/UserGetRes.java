package py.com.jmbr.java.commons.domain.mcs.user;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserGetRes {
    private User user;

    @Override
    public String toString() {
        return "UserGetRes{" +
                "user=" + user +
                '}';
    }
}
