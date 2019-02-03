package org.vsoft.vspetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import org.vsoft.vspetclinic.model.Vet;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
