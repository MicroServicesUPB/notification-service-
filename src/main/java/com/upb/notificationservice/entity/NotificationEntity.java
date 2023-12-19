package com.upb.notification.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "notifications")
public class NotificationEntity {

    @Id
    private String id;
    private String userId;
    private String reservationId;
    private String status;
    private String message;
    private String timestamp;
}
