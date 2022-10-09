package taskTracker.dto.response;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class EstimationResponse {

    private LocalDate created;
    private LocalDate deadline;
    private int reminder;

}
