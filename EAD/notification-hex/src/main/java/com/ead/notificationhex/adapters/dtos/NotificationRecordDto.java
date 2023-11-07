package com.ead.notificationhex.adapters.dtos;

import com.ead.notificationhex.core.domain.enums.NotificationStatus;
import jakarta.validation.constraints.NotNull;

public record NotificationRecordDto(@NotNull NotificationStatus notificationStatus) {
}
