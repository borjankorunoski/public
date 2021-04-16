package mk.borjankorunoski.library.model.enumerations;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {
    ROLE_ADMIN,ROLE_CLIENT,ROLE_LIBRARIAN;

    @Override
    public String getAuthority() {
        return name();
    }
}
