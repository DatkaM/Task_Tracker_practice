package taskTracker.dto.request;

import lombok.Getter;
import lombok.Setter;
import taskTracker.model.Role;

import java.util.List;

@Getter
@Setter
public class AuthInfoRequest {

    private String email;
    private String password;
    private List<Role> roles;
}
