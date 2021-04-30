package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.services.crudservice.CrudService;

import java.util.Set;

public interface OwnerServices extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);

}
