package py.com.jmbr.java.commons.beans.mcs.user;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import py.com.jmbr.java.commons.domain.mcs.user.UserPostReq;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@ToString
@Getter
@Setter
@NoArgsConstructor
public class UserPostReqData {
    @NotNull(message = "user is null")
    @Valid
    private UserPostReq data;
}
