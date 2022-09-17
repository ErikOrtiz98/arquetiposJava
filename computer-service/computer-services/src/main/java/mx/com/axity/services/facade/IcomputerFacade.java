package mx.com.axity.services.facade;

import mx.com.axity.commons.to.*;

import java.util.List;

public interface IcomputerFacade {

    List<UserTO> getAllUsers();
    UserTO getUsersByid(Long id);
    List<OrderTO> getAllOrders();
    OrderTO getOrderByid(int id);
    ResponseTO createOrder(OrderTO request);
    ResponseTO createComputer(ComputersTO request);
}
