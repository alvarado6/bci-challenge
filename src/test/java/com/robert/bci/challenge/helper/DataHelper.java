package com.robert.bci.challenge.helper;

import com.robert.bci.challenge.entity.Phone;
import com.robert.bci.challenge.dto.UserRegisterDTO;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DataHelper {

    public UserRegisterDTO getRegisterDefaultEmpty() {
        return  new UserRegisterDTO();
    }

    public UserRegisterDTO getRegisterDefault() {
        UserRegisterDTO registerDto = new UserRegisterDTO();
        registerDto.setName("Robert Alvarado");
        registerDto.setEmail("robert@2bci.com");
        registerDto.setPassword("RobertAlv33");
        registerDto.setPhones(getPhonesDefault());
        return registerDto;
    }

    public List<Phone> getPhonesDefault() {
        List<Phone> phoneDtos = new ArrayList<>();
        Phone phones = new Phone();
        phones.setNumber("1234567890");
        phones.setCitycode("1");
        phones.setContrycode("56");
        phoneDtos.add(phones);
        return phoneDtos;
    }

}
