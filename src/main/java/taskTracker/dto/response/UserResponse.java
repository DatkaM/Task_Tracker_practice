package taskTracker.dto.response;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class UserResponse {

    private Long id;
    private String name;
    private String surname;
    private String photo;
    private String email;
    private List<WorkspaceResponse> projects;
}
