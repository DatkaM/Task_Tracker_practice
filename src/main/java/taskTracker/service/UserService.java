package taskTracker.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import taskTracker.repository.UserRepository;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;


}
