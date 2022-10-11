package taskTracker.enums;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {

    ADMIN,
    SUPER_ADMIN,
    USER;

    @Override
    public String getAuthority() {
        return this.name();
    }
}
