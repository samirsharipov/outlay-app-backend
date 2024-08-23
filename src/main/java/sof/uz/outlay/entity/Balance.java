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
@Entity(name = "balance")
@Table(name = "balance")

public class Balance extends BasicEntity {

    @Column(name = "amount")
    private Double amount;

    @ManyToOne(optional = false)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(optional = false)
    @JoinColumn(name = "currency_id")
    private Currency currency;


}
