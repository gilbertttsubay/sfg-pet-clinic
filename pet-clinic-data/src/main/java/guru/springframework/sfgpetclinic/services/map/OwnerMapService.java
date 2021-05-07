package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.services.OwnerServices;
import guru.springframework.sfgpetclinic.services.crudservice.CrudService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class OwnerMapService extends AbstractMapService<Owner,Long> implements OwnerServices {

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(),object);
    }

    @Override
    public void deleteMethod(Owner object) {
        super.delete(object);
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner findByLastName(String lastName) {
        List<Owner> allOwner = (List<Owner>) super.findAll();

        Owner ownerByLastName = new Owner();

        allOwner.stream().forEach(i ->
                {
                    if (i.getLastName() == lastName) {
                        ownerByLastName.setLastName(i.getLastName());
                        ownerByLastName.setFirstName(i.getFirstName());
                        ownerByLastName.setId(i.getId());


                    } else {

                    }
                }
        );
        return ownerByLastName;
    }
}
