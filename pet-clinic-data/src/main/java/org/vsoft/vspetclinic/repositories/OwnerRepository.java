package org.vsoft.vspetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import org.vsoft.vspetclinic.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
