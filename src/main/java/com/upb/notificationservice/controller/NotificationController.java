package com.upb.notificationservice.controller;

import com.upb.notificationservice.model.Notification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/notifications")
public class NotificationController {
    @Autowired
    private NotificationService notificationservice;
    @PostMapping
    public ResponseEntity<Long> sendNotification(@RequestBody Notification notification) {
        long notificationId = notificationService.addTable(notification);
        return new ResponseEntity<>(notificationId, HttpStatus.CREATED);
    }
}
