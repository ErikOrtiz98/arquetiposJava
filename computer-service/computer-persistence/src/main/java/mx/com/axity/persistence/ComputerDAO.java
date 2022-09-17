package mx.com.axity.persistence;

import mx.com.axity.model.*;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface ComputerDAO extends CrudRepository<ComputersDO, Long> {

    List<ComputersDO> findAll();
    ComputersDO findByIdcomputer(Long idcomputer);
    List<ComputersDO> findAllByIdorder(int id);
}
