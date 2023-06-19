package com.robert.bci.challenge.service;

import com.robert.bci.challenge.exception.BCIException;
import com.robert.bci.challenge.dto.UserRegisterDTO;
import com.robert.bci.challenge.entity.User;
import com.robert.bci.challenge.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@Service
public class AuthorizationService {

    final UserRepository userRepository;
    final UsersService usersService;

    @Autowired
    public AuthorizationService(UserRepository userRepository, UsersService usersService) {
        this.userRepository = userRepository;
        this.usersService = usersService;
    }

    @Transactional
    public User register(UserRegisterDTO registerDto) throws BCIException {
        log.info("register | registerDto={}", registerDto);
        usersService.validNotExistByEmail(registerDto.getEmail());
        User users = usersService.save(registerDto);
        return users;
    }

    public List<User> getUsersRegister(){
        return usersService.getUsersRegister();
    }

}
