package taskTracker.dto.response;

import lombok.Getter;
import lombok.Setter;
import taskTracker.dto.request.CardRequest;
import taskTracker.dto.request.ColumnRequest;
import taskTracker.dto.request.UserRequest;
import taskTracker.dto.request.WorkspaceRequest;
import taskTracker.model.Column;

import java.util.List;

@Getter
@Setter
public class BoardResponse {

    private String title;
    private boolean isFavorite;
    private String photo;
    private List<ColumnResponse> columns;
    private List<UserResponse> userRequests;
    private List<WorkspaceResponse> workspaceRequests;
    private List<CardResponse> cardRequests;
}
