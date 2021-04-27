package guru.springframwork.sfgpetclinic.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Pet {

    private LocalDate birthDate;
    private Owner owner;
    private PetType type;
}
