package com.ead.course.dtos;

import lombok.Data;

import jakarta.validation.constraints.NotNull;
import java.util.UUID;

@Data
public class SubscriptionDto {

    @NotNull
    private UUID userId;
}
