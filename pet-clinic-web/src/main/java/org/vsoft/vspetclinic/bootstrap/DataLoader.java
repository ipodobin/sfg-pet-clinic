package org.vsoft.vspetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.vsoft.vspetclinic.model.*;
import org.vsoft.vspetclinic.services.OwnerService;
import org.vsoft.vspetclinic.services.PetTypeService;
import org.vsoft.vspetclinic.services.SpecialityService;
import org.vsoft.vspetclinic.services.VetService;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {


    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialityService specialityService;

    public DataLoader(OwnerService ownerService,
                      VetService vetService,
                      PetTypeService petTypeService,
                      SpecialityService specialityService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialityService = specialityService;
    }

    @Override
    public void run(String... args) throws Exception {

        int count = petTypeService.findAll().size();
        if (count == 0) {
            loadData();
        }
    }

    private void loadData() {
        PetType dog = new PetType();
        dog.setName("dog");
        dog = petTypeService.save(dog);
        PetType cat = new PetType();
        cat.setName("cat");
        cat = petTypeService.save(cat);


        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        owner1.setAddress("123");
        owner1.setCity("Toronto");
        owner1.setPhone("32453647586");
        Pet pet1 = new Pet();
        pet1.setPetType(dog);
        pet1.setBirthDay(LocalDate.now());
        pet1.setName("Zaza");
        owner1.addPet(pet1);
        owner1 = ownerService.save(owner1);
        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");
        owner2.setAddress("345");
        owner2.setCity("Toronto");
        owner2.setPhone("34567");
        Pet pet2 = new Pet();
        pet2.setPetType(cat);
        pet2.setBirthDay(LocalDate.now());
        pet2.setName("Beza");
        owner2.addPet(pet2);
        owner2 = ownerService.save(owner2);
        System.out.println("Loaded owners...");

        Speciality radiology = new Speciality();
        radiology.setDescription("radiology");
        radiology = specialityService.save(radiology);
        Speciality surgery = new Speciality();
        surgery.setDescription("surgery");
        surgery = specialityService.save(surgery);
        Speciality dentistry = new Speciality();
        dentistry.setDescription("dentistry");
        dentistry = specialityService.save(dentistry);
        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");
        vet1.getSpecialities().add(surgery);
        vet1.getSpecialities().add(radiology);
        vetService.save(vet1);
        Vet vet2 = new Vet();
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");
        vet2.getSpecialities().add(surgery);
        vet2.getSpecialities().add(dentistry);
        vetService.save(vet2);

        System.out.println("Loaded vets...");
    }
}
