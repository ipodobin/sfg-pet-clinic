package org.vsoft.vspetclinic.services.map;

import org.springframework.stereotype.Service;
import org.vsoft.vspetclinic.model.Owner;
import org.vsoft.vspetclinic.services.OwnerService;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {
    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
