package guru.springframework.sfgpetclinic.services.crudservice;

import java.util.Set;

public interface CrudService<T,ID> {
    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void deleteMethod(T object);

    void deleteById(ID id);
}
