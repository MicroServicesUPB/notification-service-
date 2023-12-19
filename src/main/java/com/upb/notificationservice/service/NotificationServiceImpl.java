package com.upb.notificationservice.service;

import com.upb.notificationservice.entity.NotificationEntity;
import com.upb.notificationservice.model.Notification;
import com.upb.notificationservice.repository.NotificationRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class NotificationServiceImpl implements NotificationService{
    @Autowired
    private NotificationRepository notificationRepository;
    @Override
    public long sendNotification(Notification notificationReq) {
        NotificationEntity notification = NotificationEntity.builder()
                .id(notificationReq.getId())
                .message(notificationReq.getMessage())
                .reservationId(notificationReq.getReservationId())
                .timestamp(notificationReq.getTimestamp())
                .userId(notificationReq.getUserId())
                .build();
        notificationRepository.save(notification);

        return notification.getId();
    }
}
