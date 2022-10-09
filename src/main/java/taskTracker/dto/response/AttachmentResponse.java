package taskTracker.dto.response;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
public class AttachmentResponse {
    private String link;
    private LocalDateTime attachedDate;

}
