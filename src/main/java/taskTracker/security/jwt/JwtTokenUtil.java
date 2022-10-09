package taskTracker.security.jwt;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class JwtTokenUtil {

    @Value("java-6")
    private String jwtSecret;
    private final Long JWT_TOKEN_VALIDITY = 7*24*60*1000L;

    private String createToken(Map<String, Object> claims, )
}
