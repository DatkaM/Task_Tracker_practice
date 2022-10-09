package taskTracker.dto.response;

import lombok.Getter;
import lombok.Setter;
import taskTracker.dto.request.WorkspaceRequest;
import taskTracker.model.Role;

import java.util.List;

@Getter
@Setter
public class UserResponse {

    private Long id;
    private String name;
    private String surname;
    private String email;
    private String photo;
    private Role role;
    private List<WorkspaceResponse> projects;
}
