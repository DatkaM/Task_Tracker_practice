package taskTracker.service;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import taskTracker.repository.AuthInfoRepository;

@Service
@RequiredArgsConstructor
public class AuthInfoServiceImpl implements UserDetailsService {

    private final AuthInfoRepository authInfoRepo;
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        return authInfoRepo.findByEmail(email)
                .orElseThrow(()->
                        new UsernameNotFoundException(
                                String.format("User with email - %s, not found", email)
                        ));
    }
}
