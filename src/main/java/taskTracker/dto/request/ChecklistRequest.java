package taskTracker.dto.request;

import lombok.Getter;
import lombok.Setter;
import taskTracker.model.Card;

import java.util.List;

@Getter
@Setter
public class ChecklistRequest {

    private String name;
    private int taskTracker;
    private List<SubTaskRequest> subTaskRequests;
    private Card cardId;
}
