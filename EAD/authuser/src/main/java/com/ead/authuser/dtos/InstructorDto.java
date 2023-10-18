package com.ead.authuser.dtos;

import lombok.Data;

import jakarta.validation.constraints.NotNull;
import java.util.UUID;

@Data
public class InstructorDto {

    @NotNull
    private UUID userId;
}
