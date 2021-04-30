package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Pet;
import guru.springframework.sfgpetclinic.services.crudservice.CrudService;

import java.util.Set;

public interface PetServices extends CrudService<Pet, Long> {

}
