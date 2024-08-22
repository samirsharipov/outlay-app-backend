package sof.uz.outlay.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "notification")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Notification extends BasicEntity{
    private String title;
    private String read;

//    private Message message;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
