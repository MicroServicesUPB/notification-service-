package com.upb.notificationservice.service;

import com.upb.notificationservice.model.Notification;

public interface NotificationService {
    long sendNotification(Notification notification);
}
