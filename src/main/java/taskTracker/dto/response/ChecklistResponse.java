package taskTracker.dto.response;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ChecklistResponse {

    private String name;
    private int taskTracker;
    private List<SubTaskResponse> taskResponses;

}
