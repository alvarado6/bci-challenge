package com.robert.bci.challenge.controller;

import com.robert.bci.challenge.dto.UserRegisterDTO;
import com.robert.bci.challenge.exception.BCIException;
import com.robert.bci.challenge.service.AuthorizationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Slf4j
@RestController
@RequestMapping(path = "/auth/v1")
public class AuthorizationRestController {

    AuthorizationService authorizationService;

    @Autowired
    public AuthorizationRestController(AuthorizationService authorizationService) {
        this.authorizationService = authorizationService;
    }

    @PostMapping("/register")
    public ResponseEntity<?> userRegister(@Valid @RequestBody UserRegisterDTO userRegisterDTO) throws BCIException {
        log.info("user-register | UserRegisterDto={}", userRegisterDTO.toString());
        return ResponseEntity.status(HttpStatus.CREATED).body(authorizationService.register(userRegisterDTO));
    }

    @GetMapping("/getUsers")
    public ResponseEntity<?> getUserRegister() throws BCIException {
        log.info("get-user-register");
        return ResponseEntity.status(HttpStatus.OK).body(authorizationService.getUsersRegister());
    }
}
