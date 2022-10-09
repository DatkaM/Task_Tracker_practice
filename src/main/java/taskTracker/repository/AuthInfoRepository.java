package taskTracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import taskTracker.model.AuthInfo;

import java.util.Optional;

public interface AuthInfoRepository extends JpaRepository<AuthInfo, Long> {

    Optional<AuthInfo> findByEmail(String email);
}