package com.shamalweerasooriya.reviewverine_auth.dto;

public record RegistrationRequestDto(
        String username,
        String email,
        String password
) {
}
