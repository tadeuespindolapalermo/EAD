package com.ead.course.dtos;

import lombok.Data;

import jakarta.validation.constraints.NotBlank;

@Data
public class ModuleDto {

    @NotBlank
    private String title;

    @NotBlank
    private String description;
}
