package sof.uz.outlay.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import sof.uz.outlay.entity.template.BasicEntity;

@Entity(name = "message")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Message extends BasicEntity {
    private String text;
    private User sender;
    private User receiver;
    private boolean read;
}
