package com.upb.notification.client;

import com.upb.notification.model.NotificationModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class NotificationClient {

    private final String baseUrl;
    private final RestTemplate restTemplate;

    public NotificationClient(String baseUrl) {
        this.baseUrl = baseUrl;
        this.restTemplate = new RestTemplate();
    }

    public ResponseEntity<NotificationModel> createNotification(NotificationModel notificationModel) {
        String url = baseUrl + "/notifications";
        return restTemplate.postForEntity(url, notificationModel, NotificationModel.class);
    }

    public ResponseEntity<NotificationModel> getNotificationById(String id) {
        String url = baseUrl + "/notifications/" + id;
        return restTemplate.getForEntity(url, NotificationModel.class);
    }

}
