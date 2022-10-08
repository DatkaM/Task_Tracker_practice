package taskTracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import taskTracker.model.Column;

public interface ColumnRepository extends JpaRepository<Column, Long> {
}