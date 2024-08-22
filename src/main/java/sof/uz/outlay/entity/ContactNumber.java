package sof.uz.outlay.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "contactNumbers")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContactNumber extends BasicEntity {
    private String number;
    @ManyToOne
    @JoinColumn(name = "contact_id")
    private Contact contact;
}
