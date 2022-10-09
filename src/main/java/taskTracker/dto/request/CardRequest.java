package taskTracker.dto.request;

import lombok.Getter;
import lombok.Setter;
import taskTracker.model.User;

import java.util.List;

@Getter
@Setter
public class CardRequest {

    private String title;
    private String description;
    private List<User> members;
    private EstimationRequest estimationRequest;
    private ColumnRequest columnId;
    private List<LabelRequest> labelRequests;
    private List<AttachmentRequest> attachmentRequests;
    private List<CommentRequest> commentRequests;
    private BoardRequest boardId;

}
