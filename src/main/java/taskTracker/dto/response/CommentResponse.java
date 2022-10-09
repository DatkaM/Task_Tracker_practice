package taskTracker.dto.response;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class CommentResponse {

    private String text;
    private LocalDateTime created;
    private UserResponse userResponse;
}
