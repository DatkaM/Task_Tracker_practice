package taskTracker.dto.request;

import lombok.Getter;
import lombok.Setter;
import taskTracker.model.User;

import java.util.List;

@Getter
@Setter
public class SubTaskRequest {

    private String description;
    private List<User> workspacesUsers;
    private EstimationRequest estimation;
    private ChecklistRequest checklist;
}
