package com.apps.quantitymeasurement.service;

import org.springframework.security.core.userdetails.*;
import org.springframework.stereotype.Service;

import com.apps.quantitymeasurement.*;
import com.apps.quantitymeasurement.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {

    private final UserRepository repository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

        return repository.findByEmail(email)
                .orElseThrow(() -> new UsernameNotFoundException("User not found"));
    }
}
