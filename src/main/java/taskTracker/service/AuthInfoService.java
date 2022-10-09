package taskTracker.service;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import taskTracker.dto.request.AuthInfoRequest;
import taskTracker.dto.response.AuthInfoResponse;
import taskTracker.model.User;
import taskTracker.repository.AuthInfoRepository;

@Service
@RequiredArgsConstructor
public class AuthInfoService {

    private final AuthInfoRepository authInfoRepository;
    private final BCryptPasswordEncoder passwordEncoder;



}
