package taskTracker.dto.response;

import lombok.Getter;
import lombok.Setter;
import taskTracker.enums.LabelsColor;

@Getter
@Setter
public class LabelResponse {

    private String description;
    private LabelsColor color;
}
