package sof.uz.outlay.entity;

import jakarta.persistence.*;
import lombok.*;
import sof.uz.outlay.entity.template.BasicEntity;
import sof.uz.outlay.enums.TransactionType;

import java.sql.Timestamp;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Transaction extends BasicEntity {

    private double amount;

    private String description;

    @ManyToOne(optional = false)
    private User user;

    @ManyToOne(optional = false)
    private Currency currency;

    @Enumerated(EnumType.STRING)
    private TransactionType transactionType;

    @ManyToOne(optional = false)
    private Contact contact;

    private Timestamp deadline;



}
