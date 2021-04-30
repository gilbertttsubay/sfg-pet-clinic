package guru.springframework.sfgpetclinic.model;

import guru.springframework.sfgpetclinic.model.baseentity.BaseEntity;
import lombok.Data;

@Data
public class PetType extends BaseEntity {

    private String name;
}
