package mx.com.axity.persistence;

import mx.com.axity.model.*;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface KeyboardDAO extends CrudRepository<KeyboardDO, Long> {

    List<KeyboardDO> findAll();
    KeyboardDO findByIdkeyboard(long idkeyboard);
}
