package mx.com.axity.services.service;

import mx.com.axity.commons.to.*;
import java.util.List;

public interface IcomputerService {

    List<UserTO> getUsers();
    UserTO  getUsersbyid(Long id);
    List<OrderTO> GetOrders();
    OrderTO getOrderById(int id);
    ResponseTO Createorder(OrderTO request);
    ResponseTO createComputer(ComputersTO request);
}
