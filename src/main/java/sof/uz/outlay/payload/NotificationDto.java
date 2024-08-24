package sof.uz.outlay.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NotificationDto {
    private UUID id;//get all
    private String title;//get all

    private String text;//get one
    private boolean read;//get one
}
