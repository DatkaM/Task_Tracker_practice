package taskTracker.dto.request;

import lombok.Getter;
import lombok.Setter;
import taskTracker.enums.LabelsColor;

@Getter
@Setter
public class LabelRequest {

    private String description;
    private LabelsColor color;
    private Long cardId;

}
