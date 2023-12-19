package com.upb.notification.model;

import lombok.Data;

@Data
public class NotificationModel {

    private String id;
    private String userId;
    private String reservationId;
    private String status;
    private String message;
    private String timestamp;
}
