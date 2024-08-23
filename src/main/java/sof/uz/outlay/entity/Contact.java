package sof.uz.outlay.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import sof.uz.outlay.entity.template.BasicEntity;

@Entity(name = "contacts")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Contact extends BasicEntity {
    private String name;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
