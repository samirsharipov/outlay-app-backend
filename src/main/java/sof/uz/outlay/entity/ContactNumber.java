package sof.uz.outlay.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import sof.uz.outlay.entity.template.BasicEntity;

@Entity(name = "contactNumbers")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContactNumber extends BasicEntity {

    private String number;

    @ManyToOne
    private Contact contact;
}
