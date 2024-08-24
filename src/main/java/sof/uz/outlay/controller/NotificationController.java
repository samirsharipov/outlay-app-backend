package sof.uz.outlay.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import sof.uz.outlay.entity.Notification;
import sof.uz.outlay.payload.ApiResponse;
import sof.uz.outlay.service.NotificationService;

import java.util.UUID;

@RestController
@RequestMapping("/api/notification")
@RequiredArgsConstructor
public class NotificationController {

    private final NotificationService service;

    @GetMapping("/{userId}")
    public ResponseEntity<ApiResponse> getAllNotifications(@PathVariable UUID userId) {
        ApiResponse apiResponse = service.getAllNotifications(userId);
        return ResponseEntity.status(apiResponse.isSuccess() ? 200 : 409).body(apiResponse);
    }

    @GetMapping("/{notificationId}")
    public ResponseEntity<ApiResponse> getNotification(@PathVariable UUID notificationId) {
        ApiResponse apiResponse = service.getNotification(notificationId);
        return ResponseEntity.status(apiResponse.isSuccess() ? 200 : 409).body(apiResponse);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ApiResponse> deleteNotification(@PathVariable UUID id) {
        ApiResponse apiResponse = service.deleteOneNotification(id);
        return ResponseEntity.status(apiResponse.isSuccess() ? 200 : 409).body(apiResponse);
    }
}
