package com.shamalweerasooriya.reviewverine_auth.mapper;

import com.shamalweerasooriya.reviewverine_auth.dto.RegistrationRequestDto;
import com.shamalweerasooriya.reviewverine_auth.dto.RegistrationResponseDto;
import com.shamalweerasooriya.reviewverine_auth.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserRegistrationMapper {

    public User toEntity(RegistrationRequestDto registrationRequestDto) {
        final var user = new User();

        user.setEmail(registrationRequestDto.email());
        user.setUsername(registrationRequestDto.username());
        user.setPassword(registrationRequestDto.password());

        return user;
    }

    public RegistrationResponseDto toRegistrationResponseDto(
            final User user) {

        return new RegistrationResponseDto(
                user.getEmail(), user.getUsername());
    }

}