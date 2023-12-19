package com.upb.notificationservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "NOTIFICATIONS")
public class NotificationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name="USER_ID")
    private Long userId;
    @Column(name="RESERVATION_ID")
    private Long reservationId;
    @Column(name="MESSAGE")
    private String message;
    @Column(name="TIMESTAMP")
    private Date timestamp;
}
