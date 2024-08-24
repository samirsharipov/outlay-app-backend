package sof.uz.outlay.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import sof.uz.outlay.entity.template.BasicEntity;

@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Balance extends BasicEntity {

    private Double amount;

    @ManyToOne(optional = false)
    private User user;

    @ManyToOne(optional = false)
    private Currency currency; // DOLLAR / SOM
}
