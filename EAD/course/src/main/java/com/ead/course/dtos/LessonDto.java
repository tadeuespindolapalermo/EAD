package com.ead.course.dtos;

import lombok.Data;

import jakarta.validation.constraints.NotBlank;

@Data
public class LessonDto {

    @NotBlank
    private String title;

    private String description;

    @NotBlank
    private String videoUrl;


}
