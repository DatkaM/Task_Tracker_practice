package taskTracker.dto.response;

import lombok.Getter;
import lombok.Setter;
import taskTracker.model.Card;
import taskTracker.model.User;

import java.util.List;

@Getter
@Setter
public class WorkspaceResponse {

    private Long id;
    private String name;
    private String photo;
    private boolean isFavorite;
    private UserResponseForWorkspaceCreator creator;
    private List<User> members;
    private List<Card> allIssues;
}
