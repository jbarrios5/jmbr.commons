package py.com.jmbr.java.commons.beans.mcs.auth;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import py.com.jmbr.java.commons.domain.mcs.auth.AuthPostReq;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@NoArgsConstructor
@Getter
@Setter
public class AuthPostReqData {
    @NotNull(message = "req can not be  null")
    @Valid
    private AuthPostReq data;
}
