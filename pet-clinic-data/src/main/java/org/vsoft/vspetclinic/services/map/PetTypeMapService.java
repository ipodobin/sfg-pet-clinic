package org.vsoft.vspetclinic.services.map;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import org.vsoft.vspetclinic.model.PetType;
import org.vsoft.vspetclinic.services.PetTypeService;

@Service
@Profile({"default", "map"})
public class PetTypeMapService extends AbstractMapService<PetType, Long> implements PetTypeService {
}
