package taskTracker.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegisterRequest {

    private String name;
    private String surname;
    private String email;
    private String password;

}
