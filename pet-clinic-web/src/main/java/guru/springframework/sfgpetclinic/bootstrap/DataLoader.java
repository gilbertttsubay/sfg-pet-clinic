package guru.springframework.sfgpetclinic.bootstrap;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.services.OwnerServices;
import guru.springframework.sfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final VetService vetService;
    private final OwnerServices ownerServices;

    public DataLoader(VetService vetService, OwnerServices ownerServices) {
        this.vetService = vetService;
        this.ownerServices = ownerServices;
    }


    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1l);
        owner1.setFirstName("Johnny");
        owner1.setFirstName("Benando");

        ownerServices.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2l);
        owner2.setFirstName("Bernard");
        owner2.setLastName("Benny");

        ownerServices.save(owner2);

        System.out.println("Owner saving process loaded ....");


        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Lehmann");
        vet1.setLastName("Corneo");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Maxell");
        vet2.setLastName("Constantinus");

        vetService.save(vet2);

        System.out.println("Vet saving process loaded ...");

    }
}
