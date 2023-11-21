package py.com.jmbr.java.commons.beans.mcs.user;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import py.com.jmbr.java.commons.domain.mcs.user.UserGetRes;

@NoArgsConstructor
@Getter
@Setter
public class UserGetResData {
    private UserGetRes data;

    @Override
    public String toString() {
        return "UserGetResData{" +
                "data=" + data +
                '}';
    }
}
