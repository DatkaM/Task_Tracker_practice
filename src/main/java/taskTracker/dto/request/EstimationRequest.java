package taskTracker.dto.request;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class EstimationRequest {

    private LocalDate created;
    private LocalDate deadline;
    private int reminder;
    private Long cardOrTaskId;
}
