package taskTracker.dto.response;

import lombok.Getter;
import lombok.Setter;
import taskTracker.dto.request.WorkspaceRequest;

import java.util.List;

@Getter
@Setter
public class UserResponse {

    private Long id;
    private String name;
    private String surname;
    private String email;
    private String photo;
    private List<WorkspaceRequest> projects;
}
