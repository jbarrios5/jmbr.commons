package py.com.jmbr.java.commons.domain.mcs.user;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

    @ToString
    @Getter
    @Setter
    @NoArgsConstructor
    public class UserPostReq {
        @NotNull(message = "user can not be null")
        @Valid
        private User user;
    }
