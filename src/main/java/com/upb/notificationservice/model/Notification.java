package com.upb.notificationservice.model;

import lombok.Data;

import java.util.Date;

@Data
public class Notification {
    private Long id;
    private Long userId;
    private Long reservationId;
    private String message;
    private Date timestamp;
}
