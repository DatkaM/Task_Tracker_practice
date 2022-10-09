package taskTracker.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardRequest {

    private String title;
    private String photo;
    private Long workspaceId;
    private Long creatorId;
}
