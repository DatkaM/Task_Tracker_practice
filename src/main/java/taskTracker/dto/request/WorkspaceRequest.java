package taskTracker.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WorkspaceRequest {

    private String name;
    private String photo;
    private Long creatorId;

}
