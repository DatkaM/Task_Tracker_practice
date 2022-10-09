package taskTracker.dto.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SubTaskResponse {

    private String description;
    private boolean done;
    private EstimationResponse estimationResponse;
}
