package com.example.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

@Schema(description = "Событие пользователя с email и операцией")
public record UserEvent(

    @NotBlank
    @Email
    @Schema(description = "Email пользователя", example = "ivan@example.com", required = true)
    String email,

    @NotBlank
    @Schema(description = "Тип операции", example = "CREATE", required = true)
    String operation
) {}