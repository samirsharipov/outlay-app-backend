package sof.uz.outlay.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import sof.uz.outlay.entity.template.BasicEntity;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Categories extends BasicEntity {

    private String name;

    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    private Categories parentCategory;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

}
