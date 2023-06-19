package com.robert.bci.challenge.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.robert.bci.challenge.config.helper.MessageHelper;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Builder
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserPhoneDTO {

    @NotNull(message = MessageHelper.MESSAGE_NOT_NULL)
    private String number;

    @NotNull(message = MessageHelper.MESSAGE_NOT_NULL)
    private String citycode;

    @NotNull(message = MessageHelper.MESSAGE_NOT_NULL)
    private String contrycode;
}
