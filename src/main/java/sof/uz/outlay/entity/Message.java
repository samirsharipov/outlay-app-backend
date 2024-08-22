package sof.uz.outlay.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "message")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Message extends BasicEntity{
    private Integer senderId;
    private Integer qabulId;
}
