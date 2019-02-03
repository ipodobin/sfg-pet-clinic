package org.vsoft.vspetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import org.vsoft.vspetclinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
