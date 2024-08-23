package sof.uz.outlay.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
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

    @ManyToOne
    private User sender; //sender_id

    @ManyToOne
    private User receiver;

    private boolean read = false;
}
