package taskTracker.dto.mapper;

import org.springframework.stereotype.Component;
import taskTracker.dto.request.WorkspaceRequest;
import taskTracker.model.Workspace;

@Component
public class WorkspaceMapper {

    public Workspace mapToEntity(WorkspaceRequest workspaceRequest) {
        Workspace workspace = new Workspace();
        workspace.setName(workspace.getName());
        workspace.setFavorite(workspace.isFavorite());
        workspace.setPhoto(workspaceRequest.getPhoto());
        return workspace;
    }
}
