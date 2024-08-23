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

    @Column(nullable = false)
    private Double amount;

    private String description;

    @ManyToOne(optional = false)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(optional = false)
    @JoinColumn(name = "currency_id")
    private Currency currency;

    @Enumerated(EnumType.STRING)
    private TransactionType transactionType;

    @ManyToOne
    @JoinColumn(name = "contact_id")
    private Contact contact;

    private Timestamp deadline;



}
