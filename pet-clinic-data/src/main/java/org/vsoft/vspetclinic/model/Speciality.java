package org.vsoft.vspetclinic.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "specialties")
@Getter
@Setter
public class Speciality extends BaseEntity {

    @Column(name = "description")
    private String description;
}
