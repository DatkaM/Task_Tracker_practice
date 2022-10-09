package taskTracker.dto.response;

import lombok.Getter;
import lombok.Setter;
import taskTracker.dto.request.*;

import java.util.List;

@Getter
@Setter
public class CardResponse {

    private String title;
    private String description;
    private boolean isArchive;
    private List<UserResponse> members;
    private List<ChecklistResponse> checklistResponses;
    private EstimationResponse estimationResponse;
    private ColumnResponse columnResponse;
    private List<LabelResponse> labelResponses;
    private List<CommentResponse> commentResponses;
    private List<AttachmentResponse> attachmentResponses;
    private BoardResponse boardResponse;

}
