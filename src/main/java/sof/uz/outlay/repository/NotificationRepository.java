package sof.uz.outlay.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import sof.uz.outlay.entity.Notification;

import java.util.List;
import java.util.UUID;

public interface NotificationRepository extends JpaRepository<Notification, UUID> {
    List<Notification> findAllByUserIdAndDeleteFalse(UUID userId);

    @Query(value ="update notification set delete = true where id=?1")
    void deleteById (UUID id);
}
