package org.vsoft.vspetclinic.services.map;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import org.vsoft.vspetclinic.model.Speciality;
import org.vsoft.vspetclinic.services.SpecialityService;

@Service
@Profile({"default", "map"})
public class SpecialityServiceMap extends AbstractMapService<Speciality, Long> implements SpecialityService {


}
