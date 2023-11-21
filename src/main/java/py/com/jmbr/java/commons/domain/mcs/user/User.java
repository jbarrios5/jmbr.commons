package py.com.jmbr.java.commons.domain.mcs.user;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class User {

    private Long id;
    private String name;
    private String document;
    private String password;
    @JsonProperty("last_name")
    private String lastName;
    private Boolean status;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", document='" + document + '\'' +

                ", lastName='" + lastName + '\'' +
                ", status=" + status +
                '}';
    }
}
