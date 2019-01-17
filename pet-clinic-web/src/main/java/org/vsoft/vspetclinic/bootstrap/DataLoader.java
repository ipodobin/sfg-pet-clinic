package org.vsoft.vspetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.vsoft.vspetclinic.model.Owner;
import org.vsoft.vspetclinic.model.PetType;
import org.vsoft.vspetclinic.model.Vet;
import org.vsoft.vspetclinic.services.OwnerService;
import org.vsoft.vspetclinic.services.PetTypeService;
import org.vsoft.vspetclinic.services.VetService;

@Component
public class DataLoader implements CommandLineRunner {


    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {
        PetType dog = new PetType();
        dog.setName("dog");
        dog = petTypeService.save(dog);
        PetType cat = new PetType();
        cat.setName("cat");
        cat = petTypeService.save(cat);


        Owner owner1 = new Owner();
//        owner1.setId(1L);
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        ownerService.save(owner1);
        Owner owner2 = new Owner();
//        owner2.setId(2L);
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");
        ownerService.save(owner2);
        System.out.println("Loaded owners...");

        Vet vet1 = new Vet();
//        vet1.setId(1L);
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");
        vetService.save(vet1);
        Vet vet2 = new Vet();
//        vet2.setId(2L);
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");
        vetService.save(vet2);

        System.out.println("Loaded vets...");
    }
}
