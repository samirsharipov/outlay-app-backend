package sof.uz.outlay.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.w3c.dom.Notation;
import sof.uz.outlay.entity.Notification;
import sof.uz.outlay.mapper.NotificationMapper;
import sof.uz.outlay.payload.ApiResponse;
import sof.uz.outlay.payload.NotificationDto;
import sof.uz.outlay.repository.NotificationRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class NotificationService {

    private final NotificationRepository repository;
    private final NotificationMapper mapper;
    private final NotificationRepository notificationRepository;

    public ApiResponse getAllNotifications(UUID userId) {
        List<Notification> all = repository.findAllByUserIdAndDeleteFalse(userId);
        if (all.isEmpty())
            return new ApiResponse("notification not found");
        return new ApiResponse("all notification", true, mapper.toDto(all));
    }

    public ApiResponse getNotification(UUID notificationId) {
        Optional<Notification> optionalNotification = notificationRepository.findById(notificationId);
        if (optionalNotification.isEmpty()){
            return new ApiResponse("notification not found");
        }
        Notification notification = optionalNotification.get();
        notification.setRead(true);
        repository.save(notification);
        NotificationDto dto = mapper.toDto(notification);
        return new ApiResponse("notification", true, dto);
    }


    public ApiResponse deleteOneNotification(UUID id) {
        boolean exists = notificationRepository.existsById(id);
        if(!exists)
            return new ApiResponse("notification not found");
        notificationRepository.deleteById(id);
        return new ApiResponse("Deleted",true);
    }
}
