package taskTracker.dto.request;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class AttachmentRequest {

    private String documentLink;
    private Long cardId;

}
