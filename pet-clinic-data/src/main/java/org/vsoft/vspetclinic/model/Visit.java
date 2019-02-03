package org.vsoft.vspetclinic.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "visits")
@Getter
@Setter
public class Visit extends BaseEntity {

    @Column(name = "description")
    private String description;

    @Column(name = "date")
    private LocalDate date;

    @ManyToOne
    @JoinColumn(name = "pet_id")
    private Pet pet;
}
