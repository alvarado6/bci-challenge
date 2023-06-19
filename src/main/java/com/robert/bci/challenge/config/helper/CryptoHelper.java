package com.robert.bci.challenge.config.helper;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class CryptoHelper {

   private final PasswordEncoder passwordEncoder;

    public String encode(String text) {
        return passwordEncoder.encode(text);
    }
}
