package sof.uz.outlay.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import sof.uz.outlay.entity.Notification;
import sof.uz.outlay.payload.NotificationDto;

import java.util.List;

@Mapper(componentModel = "spring")
public interface NotificationMapper {

//    @Mapping(source = "user.id",target = "userId")
//    @Mapping(source = "user.firstName",target = "firstName")
    NotificationDto toDto(Notification notification);

    List<NotificationDto> toDto(List<Notification> notifications);
}
