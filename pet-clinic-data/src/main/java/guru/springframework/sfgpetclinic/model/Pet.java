package guru.springframework.sfgpetclinic.model;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.model.PetType;
import guru.springframework.sfgpetclinic.model.baseentity.BaseEntity;
import lombok.Data;

import java.time.LocalDate;

@Data
public class Pet extends BaseEntity {

    private LocalDate birthDate;
    private Owner owner;
    private PetType type;
}
