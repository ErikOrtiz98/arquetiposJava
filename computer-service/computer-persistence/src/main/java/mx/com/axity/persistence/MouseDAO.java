package mx.com.axity.persistence;

import mx.com.axity.model.*;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface MouseDAO extends CrudRepository<MouseDO, Long> {

    List<MouseDO> findAll();
    MouseDO findByIdmouse(long idmouse);
}
