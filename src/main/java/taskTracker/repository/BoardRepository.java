package taskTracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import taskTracker.model.Board;

public interface BoardRepository extends JpaRepository<Board, Long> {
}