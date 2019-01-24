package org.vsoft.vspetclinic.services.map;

import org.springframework.stereotype.Service;
import org.vsoft.vspetclinic.model.Speciality;
import org.vsoft.vspetclinic.model.Vet;
import org.vsoft.vspetclinic.services.SpecialityService;
import org.vsoft.vspetclinic.services.VetService;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

    private SpecialityService specialityService;

    public VetServiceMap(SpecialityService specialityService) {
        this.specialityService = specialityService;
    }

    @Override
    public Vet save(Vet object) {

        if (object != null) {
            if (object.getSpecialities() != null) {
                object.getSpecialities().forEach(speciality -> {
                    if (speciality != null && speciality.getId() == null) {
                        Speciality savedSpeciality = specialityService.save(speciality);
                        speciality.setId(savedSpeciality.getId());
                    }
                });
            }
            return super.save(object);
        } else {
            return null;
        }
    }
}
