package taskTracker.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CommentRequest {

    private String text;
    private Long userId;
    private Long cardId;
}
