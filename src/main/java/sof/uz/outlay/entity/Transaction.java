package sof.uz.outlay.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import sof.uz.outlay.enums.TransactionType;

import java.sql.Timestamp;

@EqualsAndHashCode(callSuper = true)
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Transaction extends BasicEntity{

    @Column(nullable = false)
    Double amount;

    String description;

    @ManyToOne(optional = false)
    @JoinColumn(name = "user_id")
    User user;

    @ManyToOne(optional = false)
    @JoinColumn(name = "currency_id")
    Currency currency;

    @Enumerated(EnumType.STRING)
    TransactionType transactionType;

    @ManyToOne
    @JoinColumn(name = "contact_id")
    Contact contact;

    Timestamp deadline;



}
