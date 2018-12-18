package org.vsoft.vspetclinic.services;

import org.vsoft.vspetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
