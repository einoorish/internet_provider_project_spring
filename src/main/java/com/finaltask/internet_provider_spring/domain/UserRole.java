package com.finaltask.internet_provider_spring.domain;
import org.springframework.security.core.GrantedAuthority;

public enum UserRole implements GrantedAuthority {
    GUEST, USER, ADMIN;

    @Override
    public String getAuthority() {
        return name();
    }
}
