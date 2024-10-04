package com.springboot.bookmyshow.Controllers;

import com.springboot.bookmyshow.Services.UserService;
import com.springboot.bookmyshow.dtos.ResponseStatus;
import com.springboot.bookmyshow.dtos.SignUpRequestDto;
import com.springboot.bookmyshow.dtos.SignUpResponseDto;
import com.springboot.bookmyshow.models.User;

public class UserController {


    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    public SignUpResponseDto signUp(SignUpRequestDto signUpRequestDto) {
        SignUpResponseDto signUpResponseDto = new SignUpResponseDto();

        try {
            User user = userService.login(signUpRequestDto.getEmail(),
                    signUpRequestDto.getPassword());
            signUpResponseDto.setResponseStatus(ResponseStatus.SUCCESS);
            signUpResponseDto.setUserId(user.getId());
        } catch (Exception exception) {
            signUpResponseDto.setResponseStatus(ResponseStatus.FAILURE);
        }

        return signUpResponseDto;
    }

}
