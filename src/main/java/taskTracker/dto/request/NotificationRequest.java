package taskTracker.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NotificationRequest {

    private String text;
    private boolean read;

}
