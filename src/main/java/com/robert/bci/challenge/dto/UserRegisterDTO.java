package com.robert.bci.challenge.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.robert.bci.challenge.config.helper.MessageHelper;
import com.robert.bci.challenge.config.helper.RegexHelper;
import com.robert.bci.challenge.entity.Phone;
import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserRegisterDTO {

    @NotNull(message = MessageHelper.MESSAGE_NOT_NULL)
    private String name;

    @Email(regexp = RegexHelper.EMAIL,message = MessageHelper.MESSAGE_ERROR_REGEXP)
    @NotNull(message = MessageHelper.MESSAGE_NOT_NULL)
    private String email;

    @Pattern(regexp = RegexHelper.PASS,message = MessageHelper.MESSAGE_ERROR_REGEXP)
    @NotNull(message = MessageHelper.MESSAGE_NOT_NULL)
    private String password;

    private String token;

    @Valid
    @JsonProperty("phones")
    @NotNull(message = MessageHelper.MESSAGE_NOT_NULL)
    @Size(min = 1, message = MessageHelper.MESSAGE_EMPTY_COLLECTION)
    private List<Phone> phones;
}
