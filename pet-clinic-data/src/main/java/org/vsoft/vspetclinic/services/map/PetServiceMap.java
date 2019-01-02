package org.vsoft.vspetclinic.services.map;

import org.springframework.stereotype.Service;
import org.vsoft.vspetclinic.model.Pet;
import org.vsoft.vspetclinic.services.PetService;

@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {
}
