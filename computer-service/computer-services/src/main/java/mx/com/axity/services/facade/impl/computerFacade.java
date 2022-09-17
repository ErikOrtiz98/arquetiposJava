package mx.com.axity.services.facade.impl;

import mx.com.axity.commons.to.*;
import mx.com.axity.services.facade.IcomputerFacade;
import mx.com.axity.services.service.IcomputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class computerFacade implements IcomputerFacade {

    @Autowired
    private IcomputerService computerService;
    
    public List<UserTO> getAllUsers() {
        return this.computerService.getUsers();
    }
    public List<OrderTO> getAllOrders() {
        return this.computerService.GetOrders();
    }
    public UserTO getUsersByid(Long id) {
        return this.computerService.getUsersbyid(id);
    }
    public OrderTO getOrderByid(int id) {
        return this.computerService.getOrderById(id);
    }
    public ResponseTO createOrder(OrderTO request) {
        return this.computerService.Createorder(request);
    }
    public ResponseTO createComputer(ComputersTO request){
        return this.computerService.createComputer(request);
    }
}
