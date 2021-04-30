package guru.springframework.sfgpetclinic.model;


import guru.springframework.sfgpetclinic.model.baseentity.BaseEntity;
import lombok.Data;

@Data
public class Person extends BaseEntity {

    private String firstName;
    private String lastName;
}
