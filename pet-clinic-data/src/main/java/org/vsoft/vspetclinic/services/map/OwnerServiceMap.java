package org.vsoft.vspetclinic.services.map;

import org.vsoft.vspetclinic.model.Owner;
import org.vsoft.vspetclinic.services.OwnerService;

public class OwnerServiceMap extends AbstractMapService<Owner> implements OwnerService {
    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
