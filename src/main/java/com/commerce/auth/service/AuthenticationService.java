package com.commerce.auth.service;

import com.commerce.auth.mapper.AuthenticationMapper;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    private final AuthenticationMapper authenticationMapper;

    public AuthenticationService(AuthenticationMapper authenticationMapper) {
        this.authenticationMapper = authenticationMapper;
    }

    public String isMember(String id) {
        return authenticationMapper.selectUserName(id);
    }
}
