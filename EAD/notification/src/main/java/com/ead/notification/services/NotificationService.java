package com.ead.notification.services;

import com.ead.notification.models.NotificationModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;
import java.util.UUID;

public sealed interface NotificationService permits NotificationServiceImpl {

    NotificationModel saveNotification(NotificationModel notificationModel);

    Page<NotificationModel> findAllNotificationsByUser(UUID userId, Pageable pageable);

    Optional<NotificationModel> findByNotificationIdAndUserId(UUID notificationId, UUID userId);
}
