package org.vsoft.vspetclinic.services.map;

import org.springframework.stereotype.Service;
import org.vsoft.vspetclinic.model.PetType;
import org.vsoft.vspetclinic.services.PetTypeService;

@Service
public class PetTypeMapService extends AbstractMapService<PetType, Long> implements PetTypeService {
}
