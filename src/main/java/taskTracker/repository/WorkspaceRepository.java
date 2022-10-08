package taskTracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import taskTracker.model.Workspace;

public interface WorkspaceRepository extends JpaRepository<Workspace, Long> {
}