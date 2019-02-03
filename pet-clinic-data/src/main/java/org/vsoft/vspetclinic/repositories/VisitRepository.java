package org.vsoft.vspetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import org.vsoft.vspetclinic.model.Visit;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
